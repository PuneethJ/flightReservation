package com.puneeth.flightreservation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.puneeth.flightreservation.Repositories.UserRepo;
import com.puneeth.flightreservation.entities.User;

@Service
public class UserService {

    @Autowired
    public UserRepo userRepo;
    private BCryptPasswordEncoder encoder;

    public User createUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return userRepo.save(user);
    }

}
