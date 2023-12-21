package com.example.mongodbdocker.exception;

import com.example.mongodbdocker.exception.handler.CarNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CarNotFoundException.class)
    public ResponseEntity<?> carNotFound(CarNotFoundException carNotFoundException){
        List<String> details = new ArrayList<>();
        details.add(carNotFoundException.getMessage());
        ErrorResponse errorResponse = new ErrorResponse("Car not found", details);
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }



}
