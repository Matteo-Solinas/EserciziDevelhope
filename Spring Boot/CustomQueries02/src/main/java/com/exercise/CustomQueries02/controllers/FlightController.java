package com.exercise.CustomQueries02.controllers;

import com.exercise.CustomQueries02.entities.Flight;
import com.exercise.CustomQueries02.entities.Status;
import com.exercise.CustomQueries02.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    private final FlightService flightService;

    @Autowired
    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @PostMapping()
    public ResponseEntity<List<Flight>> createFlights(@RequestParam(name = "flightsNumber", defaultValue = "100") int n) {
        List<Flight> flights = this.flightService.createFlights(n);
        return ResponseEntity.ok().body(flights);
    }

    @GetMapping
    public ResponseEntity<List<Flight>> getAllFlights() {
        List<Flight> flightsFound = this.flightService.getAll();
        return ResponseEntity.ok().body(flightsFound);
    }

    @GetMapping("/paged")
    public ResponseEntity<Page<Flight>> getFlightPaged(@RequestParam(name = "page", defaultValue = "1") int page,
                                                       @RequestParam(name = "size", defaultValue = "5") int size) {
        Page<Flight> flightPaged = this.flightService.getFlightPaged(page, size);
        return ResponseEntity.ok().body(flightPaged);
    }

    @GetMapping("/byStatus")
    public ResponseEntity<List<Flight>> getFlightByStatus(@RequestParam(name = "status") Status status) {
        List<Flight> flightsFound = this.flightService.getFlightByStatus(status);
        return ResponseEntity.ok().body(flightsFound);
    }

    @GetMapping("/byTwoStatus")
    public ResponseEntity<List<Flight>> getFlightByTwoStatuses(@RequestParam(name = "p1") Status status1,
                                                               @RequestParam(name = "p2") Status status2) {
        List<Flight> flightsFound = this.flightService.getFlightByTwoStatuses(status1, status2);
        return ResponseEntity.ok().body(flightsFound);
    }

}
