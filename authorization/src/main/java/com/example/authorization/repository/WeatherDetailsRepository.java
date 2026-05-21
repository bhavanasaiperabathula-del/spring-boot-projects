package com.example.authorization.repository;

import com.example.authorization.entity.Weather;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WeatherDetailsRepository extends JpaRepository<Weather, String> {

    Optional<Weather> findByLocation(String location);

}
