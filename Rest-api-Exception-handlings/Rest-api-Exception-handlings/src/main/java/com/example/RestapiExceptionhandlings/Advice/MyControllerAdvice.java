package com.example.RestapiExceptionhandlings.Advice;

import com.example.RestapiExceptionhandlings.Exception.EmptyInputException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.NoSuchElementException;

@ControllerAdvice
public class MyControllerAdvice
{
    @ExceptionHandler(EmptyInputException.class)
    public ResponseEntity<String> handleEmptyInput(EmptyInputException emptyInputException)
    {
        return  new ResponseEntity<>("Input Field is empty, please look into it", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException noSuchElementException)
    {
        return  new ResponseEntity<>("No value is present in DB please change your request", HttpStatus.NOT_FOUND);
    }



}
