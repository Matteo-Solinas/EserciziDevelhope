package com.exercise.CustomQueries01.services;

import com.exercise.CustomQueries01.daos.FlightDao;
import com.exercise.CustomQueries01.entities.Flight;
import com.exercise.CustomQueries01.entities.Status;
import org.springframework.beans.factory.annotation.Autowired;
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

    public List<Flight> create50Flights() {
        List<Flight> flights = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            Flight flight = new Flight();
            flight.setDescription(generateRandomString(random));
            flight.setFromAirport(generateRandomString(random));
            flight.setToAirport(generateRandomString(random));
            flight.setStatus(Status.ONTIME);
            flights.add(flight);
        }

        return flightDao.saveAllAndFlush(flights);
    }

    private String generateRandomString(Random random) {
        return random.ints(15, 97, 123)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

}
