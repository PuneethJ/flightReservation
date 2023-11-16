package com.puneeth.flightreservation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.puneeth.flightreservation.entities.Passenger;



@Repository
public interface PassengerRepo extends JpaRepository<Passenger,Long> {
}
