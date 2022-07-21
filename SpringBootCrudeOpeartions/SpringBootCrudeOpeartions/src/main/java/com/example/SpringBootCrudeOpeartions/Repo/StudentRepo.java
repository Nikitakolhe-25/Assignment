package com.example.SpringBootCrudeOpeartions.Repo;

import com.example.SpringBootCrudeOpeartions.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo  extends JpaRepository<Student, Integer>
{

}
