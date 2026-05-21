package com.example.authorization.service;

import com.example.authorization.dto.WeatherResponse;
import com.example.authorization.entity.Weather;
import com.example.authorization.repository.WeatherDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeatherService {

    @Autowired
    WeatherDetailsRepository weatherDetailsRepository;

    public WeatherResponse getDetailsByLocation(String location){

        Optional<Weather> weather = weatherDetailsRepository.findByLocation(location);

        if (weather.isEmpty()) {
            throw new RuntimeException("Location not found");
        }

        Weather w = weather.get();

        WeatherResponse response = new WeatherResponse();
        response.setCondition(w.getCondition());
        response.setTemperature(w.getTemperature());

        return response;
    }


    public WeatherResponse addWeather(Weather weather) {

        Weather savedWeather = weatherDetailsRepository.save(weather);

        WeatherResponse response = new WeatherResponse();
        response.setCondition(savedWeather.getCondition());
        response.setTemperature(savedWeather.getTemperature());

        return response;
    }
}
