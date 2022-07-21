package com.example.SpringBootExceptionHandling.Repo;

import com.example.SpringBootExceptionHandling.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {
    Order findByName(String name);
}
