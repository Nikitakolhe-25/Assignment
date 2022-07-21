package com.example.SimpleMappingProject.Service;

import com.example.SimpleMappingProject.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentInterface
{

    Student saveData(Student student);

    List<Student> getData();

    Optional<Student> getId(int id);


    Student updateStudentById(int id, Student student);

    String deleteid(int id);

    void deleteAll();
}
