package com.exercise.EnvironmentVariables01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {

    private final Environment environment;

    @Autowired
    public GreetingController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/greeting")
    public String getGreetings() {
        return "Welcome " + environment.getProperty("devName") + ", authCode: " + environment.getProperty("authCode");
    }

}
