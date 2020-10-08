package com.maryanto.dimas.example.service;

import com.maryanto.dimas.example.document.Province;
import com.maryanto.dimas.example.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ProvinceService {

    @Autowired
    private ProvinceRepository repository;

    public Optional<Province> findId(String id) {
        return this.repository.findById(id);
    }

    public List<Province> findAll() {
        return this.repository.findAll();
    }

    @Transactional
    public Province save(Province province) {
        return this.repository.save(province);
    }

    @Transactional
    public Province update(Province province) {
        return this.repository.save(province);
    }

    @Transactional
    public boolean remove(Province province) {
        this.repository.delete(province);
        return true;
    }

    @Transactional
    public boolean removeById(String value) {
        this.repository.deleteById(value);
        return true;
    }
}
