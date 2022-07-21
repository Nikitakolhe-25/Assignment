package com.example.RestapiExceptionhandlings.Service;

import com.example.RestapiExceptionhandlings.Entity.Employee;
import com.example.RestapiExceptionhandlings.Exception.EmptyInputException;
import com.example.RestapiExceptionhandlings.Repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements  ServiceInterface
{
    @Autowired
    public EmployeeRepo employeeRepo;

    @Override
    public Employee addEmployee(Employee employee)
    {
        if (employee.getName().isEmpty() || employee.getName().length() == 0)
        {
            throw new EmptyInputException("601", "Input Fields are empyty");
        }
        Employee savedEmployee = employeeRepo.save(employee);
        return savedEmployee ;
    }

    @Override
    public List<Employee> getAllEmployee()
    {
        List<Employee> empList = employeeRepo.findAll();
        if (empList.isEmpty())
            throw  new  EmptyInputException("604", "Hey List Completely empty ,we have nothing");
        return empList;
    }

    @Override
    public Employee getEmpById(int id)
    {
        return employeeRepo.findById(id).get();
    }

    @Override
    public void deleteEmpById(int id)
    {
        employeeRepo.deleteById(id);

    }
}
