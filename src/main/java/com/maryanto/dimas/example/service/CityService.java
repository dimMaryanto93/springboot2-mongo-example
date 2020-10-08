package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.document.City;
import com.maryanto.dimas.example.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class CityService {

    @Autowired
    private CityRepository repository;

    @Autowired
    private MongoTemplate template;

    @Transactional
    public City save(City city) {
        return this.repository.save(city);
    }

    @Transactional
    public City update(City city) {
        return this.repository.save(city);
    }

    public Optional<City> findById(String id) {
        return this.repository.findById(id);
    }

    public Iterable<City> findAll() {
        return this.repository.findAll();
    }

    @Transactional
    public boolean removeById(String id) {
        this.repository.deleteById(id);
        return true;
    }
}
