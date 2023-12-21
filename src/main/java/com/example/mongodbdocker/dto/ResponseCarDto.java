package com.example.mongodbdocker.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseCarDto {
    private Long id;

    private String make;

    private String model;

    private Integer year;

    private Double engine;

    private String carColor;
}
