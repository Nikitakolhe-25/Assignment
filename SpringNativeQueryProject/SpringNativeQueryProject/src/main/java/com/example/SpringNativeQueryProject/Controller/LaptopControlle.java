package com.example.SpringNativeQueryProject.Controller;


import com.example.SpringNativeQueryProject.Entity.Laptop;
import com.example.SpringNativeQueryProject.Repo.LaptopRepo;
import com.example.SpringNativeQueryProject.service.LaptopInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopControlle
{
    @Autowired
    public LaptopInterface laptopInterface;

    @Autowired
    public LaptopRepo laptopRepo;



    @PostMapping("/laptop/save")
    public ResponseEntity<Laptop> saveLapi(@RequestBody Laptop laptop)
    {
        Laptop savedLaptop = laptopInterface.saveLapi(laptop);
        return  new ResponseEntity<Laptop>(savedLaptop, HttpStatus.CREATED);
    }

    @GetMapping("/laptop/name")
    public ResponseEntity<List<Laptop>> getLaptop(@RequestParam String name)
    {
        List<Laptop> RetrivedLaptop = laptopInterface.getLaptop(name);
        return  new ResponseEntity<List<Laptop>>(RetrivedLaptop, HttpStatus.OK);
    }

//    @GetMapping("/laptop/price")
//    public ResponseEntity<List<Laptop>> getPrice(@RequestParam BigDecimal price)
//    {
//        List<Laptop> RetrivedPrice = laptopInterface.getPrice(price);
//        return  new ResponseEntity<List<Laptop>>(RetrivedPrice, HttpStatus.FOUND);
//    }

    @GetMapping("/laptop/{firstprice}/{lastPrice}")
    public ResponseEntity<List<Laptop>> getPrice(@PathVariable int firstprice, @PathVariable int lastPrice)
    {
       List<Laptop> retive= laptopRepo.findByPriceBetween(firstprice, lastPrice);
        return  new ResponseEntity<List<Laptop>>(retive, HttpStatus.FOUND);
    }

    @GetMapping("/laptop/age/{a}/{b}")
    public ResponseEntity<List<Laptop>> getAge(@PathVariable int a, @PathVariable int b)
    {
        List<Laptop> retriveAge= laptopRepo.findByAgeBetween(a,b);
        return new ResponseEntity<List<Laptop>>(retriveAge, HttpStatus.OK);

    }


    @GetMapping("/laptop/nameandbrand")
    public ResponseEntity<List<Laptop>> getNameAndBrand(@RequestParam String name , @RequestParam String brand)
    {
        List<Laptop> retrivedNameAndAge = laptopRepo.findByNameAndBrand(name,brand);
        return  new ResponseEntity<List<Laptop>>(retrivedNameAndAge, HttpStatus.FOUND);
    }



}
