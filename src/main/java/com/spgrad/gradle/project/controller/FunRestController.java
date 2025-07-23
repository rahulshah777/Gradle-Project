package com.spgrad.gradle.project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FunRestController {

//expose "/" that returns "Hello World"

    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @Value("${app.name}")
    private String appName;

    @Value("${dev.name}")
    private String devName;

    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/appinfo")
    public String getAppInfo(){
        return "Application Name: "+appName + " ,Developer Name: " +
                devName + " ,App Version: " + appVersion;
    }

}
