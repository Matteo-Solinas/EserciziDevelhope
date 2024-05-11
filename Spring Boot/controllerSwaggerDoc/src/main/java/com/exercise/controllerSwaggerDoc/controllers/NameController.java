package com.exercise.controllerSwaggerDoc.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@Tag(name = "Controller with Swagger")
@RequestMapping("/user")
public class NameController {

    /*
    per documentazione
    http://localhost:8080/swagger-ui/index.html
    http://localhost:8080/v3/api-docs
    */

    @Operation(summary = "getName", description = "Restituisce il nome inserito come input")
    @GetMapping(path = "/name")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Il nome viene restituito con successo"),
            @ApiResponse(responseCode = "404", description = "La risorsa che si stava cercando di raggiungere non è stata trovata")
    })
    public String getName(
            @RequestParam(required = true, name = "nome")
            @Parameter(name = "nome",
                    description = "Nome inserito",
                    example = "Mario") String nome
    ) {
        return "Il nome è " + nome;
    }

    @Operation(summary = "postReverseName", description = "Il nome inserito come input viene restituito invertito")
    @PostMapping(path = "/reverseName")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Il nome viene invertito con successo"),
            @ApiResponse(responseCode = "404", description = "La risorsa che si stava cercando di raggiungere non è stata trovata")
    })
    public String postReverseName(
            @RequestParam(required = true, name = "nome")
            @Parameter(name = "nome",
                    description = "Nome inserito",
                    example = "Mario") String nome
    ) {
        return "Il nome " + nome + " invertito è: " + new StringBuilder(nome).reverse();
    }

}
