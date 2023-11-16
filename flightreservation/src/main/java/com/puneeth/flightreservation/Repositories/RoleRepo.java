package com.puneeth.flightreservation.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.puneeth.flightreservation.entities.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
    
}
