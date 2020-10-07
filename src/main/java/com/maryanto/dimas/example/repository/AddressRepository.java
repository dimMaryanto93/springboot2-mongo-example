package com.maryanto.dimas.example.repository;

import com.maryanto.dimas.example.document.Address;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AddressRepository extends PagingAndSortingRepository<Address, String> {
}
