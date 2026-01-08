package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class testController {
    @GetMapping("/hello")
    public String hello() {
        return "Day 2 success !";
    }

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome to Spring Boot";
    }

    @GetMapping("/status")
    public String status() {
        return "Backend running successfully";
    }
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello " + name;
    }
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
     @PostMapping("/user")
    public String createUser(@RequestBody User user){
        return "User" + user.getName() + "age" + user.getAge() + "recieved";
    }
}



