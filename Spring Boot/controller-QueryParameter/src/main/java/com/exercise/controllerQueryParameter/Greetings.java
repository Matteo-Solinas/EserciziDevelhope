package com.exercise.controllerQueryParameter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class Greetings {

    @GetMapping(path = "/ciao")
    public String greetings(@RequestParam String nome,@RequestParam String provincia) {
        return "Ciao " + nome + ", com'è il tempo in " + provincia + "?" ;
    }

}