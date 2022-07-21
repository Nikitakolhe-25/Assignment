package com.example.RestapiExceptionhandlings.Controller;

import com.example.RestapiExceptionhandlings.Entity.Employee;
import com.example.RestapiExceptionhandlings.Service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/code")
public class EmployeeController
{
    @Autowired
    public ServiceInterface serviceInterface;

    @PostMapping("/save")
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee)
    {
        Employee employeeSaved =  serviceInterface.addEmployee(employee);
        return  new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployee()
    {
        List<Employee> listOfAllEmployee = serviceInterface.getAllEmployee();
        return new ResponseEntity<List<Employee>>(listOfAllEmployee, HttpStatus.OK);
    }

    @GetMapping("/emp/{id}")
    public ResponseEntity<?> getEmpById(@PathVariable("id") int id)
    {
        Employee empRetrived = serviceInterface.getEmpById(id);
        return  new ResponseEntity<Employee>(empRetrived, HttpStatus.OK);

    }

    @DeleteMapping("/emp/{id}")
    public ResponseEntity<Void> deleteEmpById(@PathVariable("id") int id)
    {
        serviceInterface.deleteEmpById(id);
        return  new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee)
    {
        Employee employeeSaved = serviceInterface.addEmployee(employee);
        return new ResponseEntity<Employee>(employeeSaved, HttpStatus.CREATED);
    }
}
