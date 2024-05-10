package com.exercise.controllerCors.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class ControllerName {

    @GetMapping(path = "/name")
    public String getName(
            @RequestParam String nome
    ) {
        return "Il nome è " + nome;
    }

    @PostMapping(path = "/reverseName")
    public String postReverseName(
            @RequestParam String nome
    ) {
        return "Il nome " + nome + " invertito è: " + new StringBuilder(nome).reverse();
    }
}
