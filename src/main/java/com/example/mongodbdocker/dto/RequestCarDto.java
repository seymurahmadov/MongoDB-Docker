package com.example.mongodbdocker.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;

@Getter
@Setter
public class RequestCarDto {

//    @NotNull(message = "Bos ola bilmez")
    private String make;

//    @NotNull(message = "Bos ola bilmez")
    private String model;

//    @NotNull(message = "Null ola bilmez")
    @Max(value = 5,message = "ola bilmes")
    private Integer year;

    private Double engine;

    private String carColor;
}
