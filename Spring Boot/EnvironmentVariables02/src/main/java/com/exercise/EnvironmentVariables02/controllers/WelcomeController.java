package com.exercise.EnvironmentVariables02.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class WelcomeController {

    private final Environment environment;

    @Autowired
    public WelcomeController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/welcome")
    public String getWelcomeMsg() {
        return environment.getProperty("welcomeMsg");
    }

}
