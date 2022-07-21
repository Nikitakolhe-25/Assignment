package com.example.SpringNativeQueryProject.service;
import com.example.SpringNativeQueryProject.Entity.Laptop;
import com.example.SpringNativeQueryProject.Repo.LaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class LaptopService  implements  LaptopInterface{

@Autowired
public LaptopRepo laptopRepo;

    @Override
    public Laptop saveLapi(Laptop laptop) {
        return laptopRepo.save(laptop);
    }

    @Override
    public List<Laptop> getLaptop(String name) {
        return laptopRepo.findByName(name);
    }

//    @Override
//    public List<Laptop> getPrice(BigDecimal price) {
//        return laptopRepo.findByPrice(price);
//    }
}
