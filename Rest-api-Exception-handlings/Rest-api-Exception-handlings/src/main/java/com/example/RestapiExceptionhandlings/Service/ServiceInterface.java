package com.example.RestapiExceptionhandlings.Service;

import com.example.RestapiExceptionhandlings.Entity.Employee;

import java.util.List;

public interface ServiceInterface {
    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Employee getEmpById(int id);

    void deleteEmpById(int id);
}
