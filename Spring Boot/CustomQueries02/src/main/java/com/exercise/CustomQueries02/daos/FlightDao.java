package com.exercise.CustomQueries02.daos;

import com.exercise.CustomQueries02.entities.Flight;
import com.exercise.CustomQueries02.entities.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightDao extends JpaRepository<Flight, Long> {

    List<Flight> findByStatus(Status status);
    
    List<Flight> findByStatusOrStatus(@Param("status1") Status status1, @Param("status2") Status status2);

    @Query(value = "SELECT * FROM flights ORDER BY from_airport", nativeQuery = true)
    Page<Flight> getFlightPaged(Pageable pageable);

}
