package com.example.Simple.Project.restController;

import com.example.Simple.Project.model.Student;
import com.example.Simple.Project.repo.StudentRepo;
import com.example.Simple.Project.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
//   private StudentService studentService;

    private StudentRepo studentRepo;

    @GetMapping("/")
    public List<Student> getallrepo()
    {
        return studentRepo.findAll();
    }

    @PostMapping("/")
    public Student saveStudents(@RequestBody Student student)
    {
        return  studentRepo.save(student);

    }

    @PutMapping("/{id}")
    public Student updateStudennt(@PathVariable int id  , @RequestBody  Student student)
    {
        student.setId(id);

        return studentRepo.save(student);
    }

    @DeleteMapping("/{id}")
    public String delleteStudent(@PathVariable int id)
    {
        studentRepo.deleteById(id);
        return "deleted";

    }

}
