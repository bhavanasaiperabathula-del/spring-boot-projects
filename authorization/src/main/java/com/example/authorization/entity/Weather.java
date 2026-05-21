package com.example.authorization.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "weather")
public class Weather {


    @Id
    private String location;
    private double temperature;
    private String condition;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
