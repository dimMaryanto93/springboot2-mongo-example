package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.document.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface ProvinceRepository extends PagingAndSortingRepository<Province, String> {

    List<Province> findAll();
}
