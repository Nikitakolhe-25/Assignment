package com.example.RestapiExceptionhandlings.Repo;

import com.example.RestapiExceptionhandlings.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
