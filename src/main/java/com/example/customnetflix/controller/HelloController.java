package com.example.customnetflix.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to CustomNetflix!";
    }

    @GetMapping("/api/health")
    public String health() {
        return "Application is running!";
    }
}
