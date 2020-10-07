package com.maryanto.dimas.example.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Builder
@Document
public class Address {

    @MongoId
    private String id;
    private String streetAddress;
    private City city;
    private Province province;
}
