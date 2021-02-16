package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloSpringBoot {

    @RequestMapping("home")
    public String boot() {
        return "Hello Spring Boot";
    }
}
