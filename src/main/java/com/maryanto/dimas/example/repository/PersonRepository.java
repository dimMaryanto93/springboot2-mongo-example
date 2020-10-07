package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.document.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, String> {
}
