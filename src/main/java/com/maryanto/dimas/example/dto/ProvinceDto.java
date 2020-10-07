package com.maryanto.dimas.example.dto;

import lombok.Builder;
import lombok.Data;

public class ProvinceDto {

    @Data
    @Builder
    public static class NewProvince {

        private String code;
        private String name;
    }
}
