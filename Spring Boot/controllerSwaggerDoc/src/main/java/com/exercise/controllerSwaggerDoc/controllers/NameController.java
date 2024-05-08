package com.exercise.controllerSwaggerDoc.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class NameController {

    //http://localhost:8080/swagger-ui/index.html
    //http://localhost:8080/v3/api-docs per documentazione

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
