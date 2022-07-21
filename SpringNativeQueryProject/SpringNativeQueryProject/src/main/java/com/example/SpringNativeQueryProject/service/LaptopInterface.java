package com.example.SpringNativeQueryProject.service;

import com.example.SpringNativeQueryProject.Entity.Laptop;

import java.math.BigDecimal;
import java.util.List;

public interface LaptopInterface {

    Laptop saveLapi(Laptop laptop);

    List<Laptop> getLaptop(String name);

//    List<Laptop> getPrice(BigDecimal price);
}
