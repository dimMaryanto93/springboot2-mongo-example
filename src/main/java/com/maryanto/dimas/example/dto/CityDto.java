package com.maryanto.dimas.example.dto;

import com.maryanto.dimas.example.document.Province;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CityDto {

    @Data
    @Builder
    public static class NewCity {

        @NotNull
        @NotEmpty
        @Min(4)
        private String code;
        @NotNull
        @NotEmpty
        private String name;
        @NotNull
        private Province province;
    }
}
