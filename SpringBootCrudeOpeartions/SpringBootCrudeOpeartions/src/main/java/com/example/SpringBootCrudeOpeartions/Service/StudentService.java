package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Student;
import com.example.SpringBootCrudeOpeartions.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService  implements  StudentInterface {
    @Autowired
    public StudentRepo studentRepo;

    @Override
    public Student post(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getdata() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<Student> getId(int id) {
        return studentRepo.findById(id);
    }

    @Override
    public Student update(int id, Student student)
    {
        student.setId(id);
        return studentRepo.save(student);
    }

    @Override
    public void delete()
    {
        studentRepo.deleteAll();


    }

    @Override
    public String deleteId(int id)
    {
        studentRepo.deleteById(id);
        return "record has deleted";
    }
}



