package com.greet.repository;

import com.greet.model.User;
import com.greet.util.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final RowMapper<User> rowMapper = (rs, rowNum) -> {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setUsername(rs.getString("username"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        user.setEmail(rs.getString("email"));
        user.setCreatedAt(rs.getTimestamp("created_at"));
        return user;
    };

    @Override
    public User findByUsername(String username) {
        String sql = "SELECT * FROM users WHERE username = ?";

        return jdbcTemplate.query(sql, rowMapper, username)
                .stream()
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean save(User user) {

        String sql = "INSERT INTO users(username,password,role,email) VALUES(?,?,?,?)";

        return jdbcTemplate.update(
                sql,
                user.getUsername(),
                HashUtil.hashPassword(user.getPassword()),
                user.getRole(),
                user.getEmail()
        ) > 0;
    }
}