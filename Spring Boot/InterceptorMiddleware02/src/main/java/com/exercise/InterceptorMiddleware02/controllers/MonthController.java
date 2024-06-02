package com.exercise.InterceptorMiddleware02.controllers;

import com.exercise.InterceptorMiddleware02.entities.Month;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {

    @GetMapping("/month")
    public Month getMonth(@RequestAttribute("monthAttribute") Month month) {
        return month;
    }

}

