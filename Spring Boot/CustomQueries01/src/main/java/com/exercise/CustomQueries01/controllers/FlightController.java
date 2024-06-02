package com.exercise.CustomQueries01.controllers;

import com.exercise.CustomQueries01.entities.Flight;
import com.exercise.CustomQueries01.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping
    public ResponseEntity<List<Flight>> createFlights() {
        List<Flight> flights = this.flightService.create50Flights();
        return ResponseEntity.ok().body(flights);
    }

    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights() {
        List<Flight> flightsFound = this.flightService.getAll();
        return ResponseEntity.ok().body(flightsFound);
    }

}
