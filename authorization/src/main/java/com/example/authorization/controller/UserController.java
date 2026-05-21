package com.example.authorization.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hello")
    public String printString(){
        return "My first security Practice";
    }
}
