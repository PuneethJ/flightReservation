package com.puneeth.flightreservation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puneeth.flightreservation.Exceptions.ResourceNotFoundException;
import com.puneeth.flightreservation.Repositories.PassengerRepo;
import com.puneeth.flightreservation.entities.Passenger;

@Service
public class PassengerService {

	@Autowired
	private PassengerRepo passengerRepo;
	public Passenger savePassenger(Passenger passenger) {
		return passengerRepo.save(passenger);
	}
	public List<Passenger> getAllPassengers() {
		List<Passenger> passengers= passengerRepo.findAll();
		return passengers.stream().toList();
	}
    public Passenger getPassengerById(Long passengerId) {
        Passenger passenger=passengerRepo.findById(passengerId).orElseThrow(() -> new ResourceNotFoundException(passengerId));
        return passenger;
    }
    public void updatePassenger(Passenger passenger, Long id) {
         Passenger passenger1=passengerRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
         passenger1.setFirstName(passenger.getFirstName());
         passenger1.setMiddleName(passenger.getMiddleName());
         passenger1.setLastName(passenger.getLastName());
         passenger1.setEmail(passenger.getEmail());
         passenger1.setPhone(passenger.getPhone());
         passengerRepo.save(passenger1);
    }

}
