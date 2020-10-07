package com.maryanto.dimas.example.mapper;

import com.maryanto.dimas.example.document.City;
import com.maryanto.dimas.example.document.Province;
import com.maryanto.dimas.example.dto.CityDto;
import com.maryanto.dimas.example.dto.ProvinceDto;
import com.maryanto.dimas.plugins.web.commons.mappers.ObjectMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

public class ProvinceMapper {

    @Mapper
    public interface Create extends ObjectMapper<Province, ProvinceDto.NewProvince> {
        ProvinceMapper.Create converter = Mappers.getMapper(ProvinceMapper.Create.class);

        @Override
        @Mappings({
                @Mapping(target = "id", ignore = true)
        })
        Province convertToEntity(ProvinceDto.NewProvince dto);
    }
}
