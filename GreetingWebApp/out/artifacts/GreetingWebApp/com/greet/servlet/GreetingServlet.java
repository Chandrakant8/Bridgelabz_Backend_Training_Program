package com.greet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        String name = request.getParameter("name");

        if (name == null || name.trim().isEmpty()) {
            name = "Guest";
        }

        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Greeting</title></head>");
        out.println("<body>");
        out.println("<h2>Hello, " + name + "!</h2>");
        out.println("<br>");
        out.println("<a href='index.jsp'>Back</a>");
        out.println("</body>");
        out.println("</html>");
    }
}