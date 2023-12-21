package com.example.mongodbdocker.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class ErrorResponse {
    String message;
    List<String> details;
}
