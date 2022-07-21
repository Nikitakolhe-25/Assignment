package com.example.SpringNativeQueryProject.Repo;
import com.example.SpringNativeQueryProject.Entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;


@Repository
public interface LaptopRepo extends JpaRepository<Laptop, Integer>
{
    List<Laptop> findByName(String name);

//    List<Laptop> findByPrice(BigDecimal price);

    List<Laptop> findByBrand(String brand);
    List<Laptop> findByPriceBetween(int firstprice, int lastPrice);
List<Laptop> findByAgeBetween(int a, int b);

List<Laptop> findByNameAndBrand(String name, String brand);

}

