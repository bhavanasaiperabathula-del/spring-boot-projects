package com.example.securityBasic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/hello")
public class UserController {
    
    @GetMapping("/getString")
    public String printString(){
        return "My first security Practice";
    }
    
}
