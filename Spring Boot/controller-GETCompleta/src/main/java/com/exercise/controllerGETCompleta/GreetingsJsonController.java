package com.exercise.controllerGETCompleta;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class GreetingsJsonController {

    @GetMapping(path = "/ciao/{provincia}")
    public User greetingsJson(
            @PathVariable String provincia,
            @RequestParam String nome
    ) {
        return new User(nome, provincia);
    }
}
