package com.example.mongodbdocker.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "cars")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CarEntity {

    @Id
    private String id;

    private String make;

    private String model;

    private Integer year;

    private Double engine;

    private String carColor;

}