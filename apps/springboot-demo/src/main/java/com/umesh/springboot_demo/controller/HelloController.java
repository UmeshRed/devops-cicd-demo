package com.umesh.springboot_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Welcome to DevOps CI/CD Lab!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello Umesh! 🚀";
    }
}
