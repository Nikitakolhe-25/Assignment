package com.example.Simple.Project.service;

import com.example.Simple.Project.model.Student;
import com.example.Simple.Project.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    @Autowired
    private StudentRepo studentRepo;

//    public List<Student> getallList()
//    {
//        return studentRepo.findAll();
//    }
//
//    public Student save(Student student)
//    {
//        return studentRepo.save(student);
//    }
//
//    public Student update(Student student)
//    {
//        return studentRepo.save(student);
//    }
//
//    public String delete(int id){
//        studentRepo.deleteById(id);
//        return "delete";
//    }





}
