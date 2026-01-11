package com.custom.annotations.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.custom.annotations.RegistrationService;

@RestController
@RequestMapping("/api/register")
public class AddUserController {

    private final RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping
    public String register(@RequestBody RegistrationDTO registrationDTO) {
        return registrationService.registerUser(registrationDTO);
    }
}
