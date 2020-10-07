package com.maryanto.dimas.example.mapper;

import com.maryanto.dimas.example.document.City;
import com.maryanto.dimas.example.dto.CityDto;
import com.maryanto.dimas.plugins.web.commons.mappers.ObjectMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

public class CityMapper {

    @Mapper
    public interface Create extends ObjectMapper<City, CityDto.NewCity> {
        CityMapper.Create converter = Mappers.getMapper(CityMapper.Create.class);

        @Override
        @Mappings({
                @Mapping(target = "id", ignore = true)
        })
        City convertToEntity(CityDto.NewCity dto);
    }



}
