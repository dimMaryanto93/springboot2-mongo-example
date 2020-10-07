package com.maryanto.dimas.example.document;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class Province {

    @Id
    private String id;
    private String code;
    private String name;
}
