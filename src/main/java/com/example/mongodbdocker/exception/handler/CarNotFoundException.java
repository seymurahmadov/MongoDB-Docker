package com.example.mongodbdocker.exception.handler;

public class CarNotFoundException extends RuntimeException{
    public CarNotFoundException(String msg){
        super(msg);
    }
}
