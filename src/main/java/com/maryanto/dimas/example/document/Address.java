package com.maryanto.dimas.example.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class Address {

    @Id
    private String id;
    private String streetAddress;
    @DBRef
    private City city;
    @DBRef
    private Province province;
}
