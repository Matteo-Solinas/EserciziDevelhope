package com.exercise.logging.controllers;

import com.exercise.logging.services.BasicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logging")
public class BasicController {

    private final BasicService basicService;

    @Autowired
    public BasicController(BasicService basicService) {
        this.basicService = basicService;
    }

    Logger logger = LoggerFactory.getLogger(BasicController.class);

    @GetMapping
    public String getGreeting() {
        logger.info("Welcome!");
        return "Welcome!";
    }

    @GetMapping("/exp")
    public double calculatePower() {
        return basicService.doPowerOfTwoInt();
    }

    @GetMapping("/get-errors")
    public void getErrors() throws Exception {
        logger.error("An error has occurred. Please try again");
        throw new Exception("This is the exception message!");
    }

}
