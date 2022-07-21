package com.example.SpringBootExceptionHandling.Controller;

import com.example.SpringBootExceptionHandling.Exception.OrderServiceException;
import com.example.SpringBootExceptionHandling.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @Autowired
    public OrderService orderService;

    @GetMapping("/getprice/{productName}")
    public String getOrderPrice(@PathVariable String productName) throws OrderServiceException {
        double amount = orderService.getprice(productName);
        return "amount for product " +productName + " is " + amount;

    }

}