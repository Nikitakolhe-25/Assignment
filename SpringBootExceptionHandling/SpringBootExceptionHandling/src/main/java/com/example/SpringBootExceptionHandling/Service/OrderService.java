package com.example.SpringBootExceptionHandling.Service;

import com.example.SpringBootExceptionHandling.Exception.OrderServiceException;
import com.example.SpringBootExceptionHandling.Model.Order;
import com.example.SpringBootExceptionHandling.Repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService
{
    @Autowired
    public OrderRepo orderRepo;

    @PostConstruct
    public void addOrder208()
    {
        List<Order> orders=new ArrayList<>();
        orders.add(new Order(881,"mobile","electroincs",56000));
        orders.add(new Order(806,"bike","veichlie",90000));
        orders.add(new Order(806,"book","student",900));
        orderRepo.saveAll(orders);
        }
    public double getprice(String productName) throws OrderServiceException {
        Order order=null;
        double amount=0;
        try {
            order=orderRepo.findByName(productName);
            amount= order.getAmount();
        }
        catch (Exception e)
        {
            throw  new OrderServiceException("order not found with product :"+productName);

        }
        return amount;

    }

}
