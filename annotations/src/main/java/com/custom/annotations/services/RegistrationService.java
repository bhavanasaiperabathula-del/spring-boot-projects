package com.custom.annotations.services;

import org.springframework.stereotype.Service;

import com.custom.annotations.LogExecution;
import com.custom.annotations.RegistrationRequestDto;

@Service
public class RegistrationService {

    @LogExecution(logArgs = true, logTime = true)
    public String registerUser(RegistrationRequestDto registrationDTO) {

        // Business logic (for now just printing)
        System.out.println("Registering user:");
        System.out.println("Username: " + registrationDTO.getUsername());
        System.out.println("Email: " + registrationDTO.getEmail());

        return "User registered successfully";
    }
}
