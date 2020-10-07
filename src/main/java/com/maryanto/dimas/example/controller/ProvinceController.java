package com.maryanto.dimas.example.controller;

import com.maryanto.dimas.example.document.City;
import com.maryanto.dimas.example.document.Province;
import com.maryanto.dimas.example.dto.ProvinceDto;
import com.maryanto.dimas.example.mapper.ProvinceMapper;
import com.maryanto.dimas.example.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.noContent;
import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/v1/province")
public class ProvinceController {

    @Autowired
    private ProvinceService service;

    @GetMapping("/{id}/findById")
    public ResponseEntity<Province> findById(@PathVariable("id") String id) {
        return this.service.findId(id).map(ResponseEntity::ok)
                .orElse(noContent()
                        .build());
    }

    @PostMapping("/new")
    public ResponseEntity<Province> save(@RequestBody @Validated ProvinceDto.NewProvince dto) {
        Province value = ProvinceMapper.Create.converter.convertToEntity(dto);
        value = this.service.save(value);
        return ok(value);
    }

    @DeleteMapping("/{id}/deleteById")
    public ResponseEntity<City> deleteById(String id) {
        this.service.removeById(id);
        return ok().build();
    }

    @GetMapping("/list")
    public List<Province> findAll() {
        return this.service.findAll();
    }
}
