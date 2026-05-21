package com.example.authorization.controller;

import com.example.authorization.dto.WeatherResponse;
import com.example.authorization.entity.Weather;
import com.example.authorization.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    @PostMapping
    @PreAuthorize("hasAuthority('WRITE')")
    public ResponseEntity<WeatherResponse> addWeather(@RequestBody Weather weather) {

        WeatherResponse response = weatherService.addWeather(weather);

        return ResponseEntity.status(201).body(response);
    }


    @GetMapping("/location")
    @PreAuthorize("hasAuthority('READ')")
    //@PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public ResponseEntity<WeatherResponse> getWeatherByLocation(@PathVariable String location){
        WeatherResponse response = null;
        try{
           response = weatherService.getDetailsByLocation(location);
           
        }catch (Exception e){
            return ResponseEntity.status(404).body(null);
        }
        return ResponseEntity.status(200).body(response);
    }
}
