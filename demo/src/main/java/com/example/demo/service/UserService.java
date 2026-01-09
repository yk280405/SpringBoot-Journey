package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String createUser(String name,int age){
        return "user " + name + " age: " + age + " processed by service.";
    }
}
