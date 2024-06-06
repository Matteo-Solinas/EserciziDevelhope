package com.exercise.deploy02.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
@RequestMapping("/api/v1")
public class BasicController {

    private final Random random;

    public BasicController(Random random) {
        this.random = random;
    }

    @GetMapping("/randomSum")
    public Integer getRandomSum() {
        Integer n1 = random.nextInt();
        Integer n2 = random.nextInt();
        return n1 + n2;
    }

}
