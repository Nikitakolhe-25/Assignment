package com.example.SimpleMappingProject.Controller;


import com.example.SimpleMappingProject.Entity.Student;
import com.example.SimpleMappingProject.Service.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    public StudentInterface studentInterface;

    @PostMapping("/save")
    public Student Save(@RequestBody Student student) {
        return studentInterface.saveData(student);
    }

    @GetMapping("/list")
    public List<Student> getall() {
        return studentInterface.getData();

    }

    @GetMapping("/{id}")
    public Optional<Student> getid(@PathVariable int id) {
        return studentInterface.getId(id);
    }
    @PutMapping("/update/{id}")
    private Student updateStudentById(@PathVariable("id") int id, @RequestBody Student student)
    {
        return  studentInterface.updateStudentById(id, student);
    }

    @DeleteMapping("/{id}")
    public  String delete(@PathVariable("id") int id)
    {
        studentInterface.deleteid(id);
       return "deletde";
  }

  @DeleteMapping("/delete")
   public  void deleteall()
    {
      studentInterface.deleteAll();
    }



}




