package com.greet.service;

import com.greet.model.User;
import com.greet.repository.UserRepository;
import com.greet.util.HashUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String username, String password) {

        User user = userRepository.findByUsername(username);

        if (user != null &&
                user.getPassword().equals(HashUtil.hashPassword(password))) {
            return user;
        }

        return null;
    }

    @Override
    public boolean register(User user) {

        if (userRepository.findByUsername(user.getUsername()) != null) {
            return false;
        }

        return userRepository.save(user);
    }
}