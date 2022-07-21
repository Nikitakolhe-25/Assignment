package com.example.SpringBootCrudeOpeartions.Service;


import com.example.SpringBootCrudeOpeartions.Entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeInterface {
    Employee post(Employee employee);


   List<Employee> getdata();

//    List<Employee> getdata(String status);

    Optional<Employee> get(int id);

    Employee updateData(int id, Employee employee);

    void delete();



    String deleteId(int id);


//    List<Employee> getdata(int age);
}
