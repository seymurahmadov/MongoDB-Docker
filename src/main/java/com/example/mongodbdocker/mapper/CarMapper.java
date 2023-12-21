package com.example.mongodbdocker.mapper;



import com.example.mongodbdocker.dto.RequestCarDto;
import com.example.mongodbdocker.dto.ResponseCarDto;
import com.example.mongodbdocker.entity.CarEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper(componentModel = "spring")
public interface CarMapper {

    CarEntity carRequestDtOToEntity(RequestCarDto requestCarDto);

    ResponseCarDto carEntityToResponseDto(CarEntity carEntity);

   List<ResponseCarDto> carEntityToResponseDto(List <CarEntity> carEntity);

    void update(@MappingTarget CarEntity carEntity, RequestCarDto requestCarDto);



}
