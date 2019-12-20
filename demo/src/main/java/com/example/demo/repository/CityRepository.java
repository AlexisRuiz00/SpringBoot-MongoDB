package com.example.demo.repository;

import com.example.demo.model.City;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends MongoRepository <City,String> {
    public List<City> findAll();
    public City insert(City city);
}
