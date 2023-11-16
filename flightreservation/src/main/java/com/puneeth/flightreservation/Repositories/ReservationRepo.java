package com.puneeth.flightreservation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.puneeth.flightreservation.entities.Reservation;

@Repository
public interface ReservationRepo  extends JpaRepository<Reservation, Long>{

}