package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Tells Spring: "This is an API"
public class HelloController {

    @GetMapping("/hello") // Tells spring: "Run this when someone visits /hello"
    public String sayHello() {
        return "Hello, World!";
    }

}
