package com.exercise.CustomQueries01.daos;

import com.exercise.CustomQueries01.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightDao extends JpaRepository<Flight, Long> {
}
