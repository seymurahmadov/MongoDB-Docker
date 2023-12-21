package com.example.mongodbdocker.controller;


import com.example.mongodbdocker.dto.RequestCarDto;
import com.example.mongodbdocker.dto.ResponseCarDto;
import com.example.mongodbdocker.service.CarService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/get-all")
    public List<ResponseCarDto> getAllController(){
        List<ResponseCarDto> all = carService.getAll();
        return all;
    }

    @PostMapping("/save")
    public void saveController(@Valid @RequestBody RequestCarDto dto){
        carService.save(dto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteController(@PathVariable Long id){
        carService.delete(id);
    }

    @PutMapping("/update/{id}")
    public void updateController(@PathVariable Long id, @RequestBody RequestCarDto carDto) {
        carService.update(id, carDto);
    }

}
