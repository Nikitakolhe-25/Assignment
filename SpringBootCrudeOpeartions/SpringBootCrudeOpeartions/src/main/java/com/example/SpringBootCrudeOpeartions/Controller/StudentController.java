package com.example.SpringBootCrudeOpeartions.Controller;

import com.example.SpringBootCrudeOpeartions.Entity.Student;
import com.example.SpringBootCrudeOpeartions.Service.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    @Autowired
    public StudentInterface studentInterface;

    @PostMapping("student/post")
    public Student saveStudent(@RequestBody Student student )
    {
        return studentInterface.post(student);
    }

    @GetMapping("student/get")
    public List<Student> getallData() {
        return studentInterface.getdata();
    }

    @GetMapping("student/get{id}")
    public Optional<Student>getById(@PathVariable int id)
    {
        return studentInterface.getId(id);
    }

    @PutMapping("student/update{id}")
    public Student updateStudent(@PathVariable("id") int id, @RequestBody Student student)
    {
        return studentInterface.update(id, student);
    }
@DeleteMapping("student/delete")
    public  void deleteall()
    {
        studentInterface.delete();

    }

    @DeleteMapping("student/delete{id}")
    public  String deleteById(@PathVariable int id)
    {
        studentInterface.deleteId(id);
        return "delete";
    }



}
