package com.springservices.ms_spring_overview.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }
    @GetMapping("/hello")
    public String sayHelloFrench() {
        return "Bonjour le monde";
    }
}
