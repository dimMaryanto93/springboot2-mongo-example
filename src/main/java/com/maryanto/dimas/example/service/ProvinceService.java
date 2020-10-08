package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.document.Province;
import com.maryanto.dimas.example.repository.ProvinceRepository;
import com.maryanto.dimas.plugins.web.commons.data.service.ServiceCrudPattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceService implements ServiceCrudPattern<Province, String> {

    @Autowired
    private ProvinceRepository repository;

    @Override
    public Optional<Province> findId(String id) {
        return this.repository.findById(id);
    }

    @Override
    public List<Province> findAll() {
        return this.repository.findAll();
    }

    @Override
    public Province save(Province province) {
        return this.repository.save(province);
    }

    @Override
    public Province update(Province province) {
        return this.repository.save(province);
    }

    @Override
    public boolean remove(Province province) {
        this.repository.delete(province);
        return true;
    }

    @Override
    public boolean removeById(String value) {
        this.repository.deleteById(value);
        return true;
    }
}
