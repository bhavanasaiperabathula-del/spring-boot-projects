package com.custom.annotations.services;

import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    public String registerUser(RegistrationDTO registrationDTO) {

        // Business logic (for now just printing)
        System.out.println("Registering user:");
        System.out.println("Username: " + registrationDTO.getUsername());
        System.out.println("Email: " + registrationDTO.getEmail());

        return "User registered successfully";
    }
}
