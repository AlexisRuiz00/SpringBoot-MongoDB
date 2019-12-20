package com.example.demo.service;

import com.example.demo.model.City;

import java.util.List;

public interface CityService {
    List<City> findAll();
    City create(City city);
}
