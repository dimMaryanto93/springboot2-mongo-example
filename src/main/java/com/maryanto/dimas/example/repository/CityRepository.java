package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.document.City;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CityRepository extends PagingAndSortingRepository<City, String> {

}
