package com.example.SpringBootCrudeOpeartions.Controller;

import com.example.SpringBootCrudeOpeartions.Entity.Employee;
import com.example.SpringBootCrudeOpeartions.Service.EmployeeInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController
{
    @Autowired
    public EmployeeInterface employeeInterface;

    @PostMapping("/employee/save")
    public Employee saveemp(@RequestBody Employee employee)
    {
        return employeeInterface.post(employee);
    }

    @GetMapping("/employee")
    public List<Employee> getallData()
    {

        return employeeInterface.getdata();
    }

    @GetMapping("/employee/get{id}")
    public Optional<Employee> getByData(@PathVariable int id)
    {
        return employeeInterface.get(id);
    }

    @PutMapping("/employee/update/{id}")
    public Employee updateEmp(@PathVariable("id") int id,  @RequestBody Employee employee)
    {
        return employeeInterface.updateData(id, employee);
    }

    @DeleteMapping("/employee/delete")
    public void deleteall()
    {
        employeeInterface.delete();
    }

    @DeleteMapping("/employee/delete/{id}")
    public  String delteById(@PathVariable("id") int id)
    {
        employeeInterface.deleteId(id);
        return "delete";
    }



}
