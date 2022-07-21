package com.example.SpringBootCrudeOpeartions.Repo;

import com.example.SpringBootCrudeOpeartions.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepos extends JpaRepository<Employee, Integer>
{

    //jpql


//    @Query("select age from Employee age  where age in (18,21)")
//    public List<Employee> getallData(int age);


}
