package com.exercise.deploy01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BasicController {

    private final Environment environment;

    @Autowired
    public BasicController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/dev")
    public String getDev() {
        return environment.getProperty("devName");
    }

}
