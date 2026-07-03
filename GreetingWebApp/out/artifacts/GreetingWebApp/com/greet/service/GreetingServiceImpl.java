package com.greet.service;

import com.greet.model.Greeting;

public class GreetingServiceImpl extends GreetingService{
    private String prefix;

    // Setter for Spring Dependency Injection
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public Greeting greet(String name) {

        if (name == null || name.trim().isEmpty()) {
            name = "Guest";
        }

        return new Greeting(prefix + ", " + name + "!");
    }

    // Bean Initialization Method
    public void init() {
        System.out.println("GreetingService Bean Initialized");
    }

    // Bean Destroy Method
    public void destroy() {
        System.out.println("GreetingService Bean Destroyed");
    }
}
