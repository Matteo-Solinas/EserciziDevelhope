package com.exercise.CustomQueries02.services;

import com.exercise.CustomQueries02.daos.FlightDao;
import com.exercise.CustomQueries02.entities.Flight;
import com.exercise.CustomQueries02.entities.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class FlightService {

    private final FlightDao flightDao;

    @Autowired
    public FlightService(FlightDao flightDao) {
        this.flightDao = flightDao;
    }

    public List<Flight> getAll() {
        return flightDao.findAll();
    }

    public List<Flight> createFlights(int n) {
        List<Flight> flights = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Flight flight = new Flight();
            flight.setDescription("Flight number: " + i);
            flight.setFromAirport(generateRandomString(random));
            flight.setToAirport(generateRandomString(random));
            flight.setStatus(generateRandomStatus(random));
            flights.add(flight);
        }

        return flightDao.saveAllAndFlush(flights);
    }

    public Page<Flight> getFlightPaged(int page, int size) {
        Pageable pageable = Pageable.ofSize(size).withPage(page);
        return flightDao.getFlightPaged(pageable);
    }

    public List<Flight> getFlightByStatus(Status status) {
        return this.flightDao.findByStatus(status);
    }

    public List<Flight> getFlightByTwoStatuses(Status status1, Status status2) {
        return this.flightDao.findByStatusOrStatus(status1, status2);
    }

    private String generateRandomString(Random random) {
        return random.ints(15, 97, 123)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    private Status generateRandomStatus(Random random) {
        return Status.values()[random.nextInt(Status.values().length)];
    }

}
