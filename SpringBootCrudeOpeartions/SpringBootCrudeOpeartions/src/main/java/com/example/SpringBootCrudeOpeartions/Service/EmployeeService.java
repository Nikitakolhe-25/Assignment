package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Employee;
import com.example.SpringBootCrudeOpeartions.Repo.EmployeeRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements EmployeeInterface {
    @Autowired
    public EmployeeRepos employeeRepos;

    @Override
    public Employee post(Employee employee) {

        return employeeRepos.save(employee);
    }

    @Override
    public List<Employee> getdata() {
        return employeeRepos.findAll();
    }

//    @Override
//    public List<Employee> getdata(String status)
//    {
//        return employeeRepos.findAll(status);
//    }


    @Override
    public Optional<Employee> get(int id) {

        return employeeRepos.findById(id);
    }

    @Override
    public Employee updateData(int id, Employee employee)
    {
        employee.setId(id);
        return  employeeRepos.save(employee);
    }

    @Override
    public void delete()
    {
        employeeRepos.deleteAll();


    }

    @Override
    public String deleteId(int id)
    {
        employeeRepos.deleteById(id);
        return " delete sucessfully";
    }



//    @Override
//    public List<Employee> getdata(int age) {
//
//        return employeeRepos.getallData(age);
//    }


}









