package com.spgrad.gradle.project.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class RestController {

//expose "/" that returns "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

}
