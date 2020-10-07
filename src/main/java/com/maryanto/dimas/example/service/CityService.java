package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.document.City;
import com.maryanto.dimas.example.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository repository;

    public City save(City city) {
        return this.repository.save(city);
    }

    public City update(City city) {
        return this.repository.save(city);
    }

    public Optional<City> findById(String id) {
        return this.repository.findById(id);
    }

    public Iterable<City> findAll() {
        return this.repository.findAll();
    }

    public boolean removeById(String id) {
        this.repository.deleteById(id);
        return true;
    }
}
