package com.maryanto.dimas.example.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;

@Data
@Builder
@Document
public class Person {

    @MongoId
    private String id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Address address;

}
