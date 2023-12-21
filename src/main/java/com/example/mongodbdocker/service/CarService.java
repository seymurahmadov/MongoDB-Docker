package com.example.mongodbdocker.service;

import com.example.mongodbdocker.dto.RequestCarDto;
import com.example.mongodbdocker.dto.ResponseCarDto;
import com.example.mongodbdocker.entity.CarEntity;
import com.example.mongodbdocker.exception.handler.CarNotFoundException;
import com.example.mongodbdocker.mapper.CarMapper;
import com.example.mongodbdocker.repository.CarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarService(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }

    public List<ResponseCarDto> getAll() {
        log.info("GetAll metodun cagirdim");
        List<CarEntity> all = carRepository.findAll();
        List<ResponseCarDto> responseCarDtos = carMapper.carEntityToResponseDto(all);
        return responseCarDtos;
    }

    public void save(RequestCarDto requestCarDto) {
        CarEntity carEntity = carMapper.carRequestDtOToEntity(requestCarDto);
        carRepository.save(carEntity);
    }

    public void delete(Long id) {
        CarEntity deletedObject = carRepository.findById(id).orElseThrow(() -> new CarNotFoundException("Car not found with this id"));
        carRepository.delete(deletedObject);
    }

    public void update(Long id, RequestCarDto requestCarDto) {
        CarEntity updateObject = carRepository.findById(id).orElseThrow(()-> new CarNotFoundException("Car not found with this id"));
        carMapper.update(updateObject, requestCarDto);
        carRepository.save(updateObject);
    }
}
