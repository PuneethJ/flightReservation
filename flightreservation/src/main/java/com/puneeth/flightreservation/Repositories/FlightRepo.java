package com.puneeth.flightreservation.Repositories;

import java.sql.Date;
import java.util.List;

//import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.puneeth.flightreservation.entities.Flight;

@Repository
public interface FlightRepo  extends JpaRepository<Flight, Long>{

    Flight getByFlightNumber(String flightNo);

    @Query("from Flight where departureCity=:departureCity and arrivalCity=:arrivalCity and dateOfDeparture=:dateOfDeparture")
    List<Flight> findFlights(@Param("departureCity")String from,@Param("arrivalCity")String to,@Param("dateOfDeparture")Date departureDate);

}
