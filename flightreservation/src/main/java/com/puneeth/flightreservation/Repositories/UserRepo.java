package com.puneeth.flightreservation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.puneeth.flightreservation.entities.User;

@Repository
public interface UserRepo  extends JpaRepository<User, Long>{

	User findByEmail(String username);

}
