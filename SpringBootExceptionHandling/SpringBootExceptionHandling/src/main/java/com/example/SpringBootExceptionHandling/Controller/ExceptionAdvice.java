package com.example.SpringBootExceptionHandling.Controller;

import com.example.SpringBootExceptionHandling.Exception.OrderServiceException;
import com.example.SpringBootExceptionHandling.Model.Order;
import com.example.SpringBootExceptionHandling.Model.OrderError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdvice
{
    @ExceptionHandler(OrderServiceException.class)
   public ResponseEntity<OrderError> mapException(OrderServiceException ex)
   {
       OrderError orderError=new OrderError(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
       return new ResponseEntity<OrderError>(orderError,HttpStatus.INTERNAL_SERVER_ERROR);
   }
}
