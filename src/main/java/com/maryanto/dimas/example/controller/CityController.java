package com.maryanto.dimas.example.controller;

import com.maryanto.dimas.example.document.City;
import com.maryanto.dimas.example.dto.CityDto;
import com.maryanto.dimas.example.mapper.CityMapper;
import com.maryanto.dimas.example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/v1/city")
public class CityController {

    @Autowired
    private CityService service;

    @GetMapping("/{id}/findById")
    public ResponseEntity<City> findById(@PathVariable("id") String id) {
        return this.service.findById(id).map(ResponseEntity::ok)
                .orElse(noContent()
                        .build());
    }

    @PostMapping("/new")
    public ResponseEntity<City> save(@RequestBody @Validated CityDto.NewCity dto) {
        City city = CityMapper.Create.converter.convertToEntity(dto);
        city = this.service.save(city);
        return ok(city);
    }

    @DeleteMapping("/{id}/deleteById")
    public ResponseEntity<City> deleteById(String id) {
        this.service.removeById(id);
        return ok().build();
    }

    @GetMapping("/list")
    public Iterable<City> findAll() {
        return this.service.findAll();
    }
}
