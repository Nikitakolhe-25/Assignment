package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentInterface {
    Student post(Student student);

    List<Student> getdata();

    Optional<Student> getId(int id);

    Student update(int id, Student student);

    void delete();

    String deleteId(int id);
}
