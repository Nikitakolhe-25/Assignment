package com.example.SimpleMappingProject.Service;

import com.example.SimpleMappingProject.Entity.Student;
import com.example.SimpleMappingProject.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService  implements StudentInterface
{
    @Autowired
    public StudentRepo studentRepo;

    @Override
    public Student saveData(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public List<Student> getData() {
        return studentRepo.findAll();
    }

    @Override
    public Optional<Student> getId(int id) {

        return studentRepo.findById(id);
    }

    @Override
    public Student updateStudentById(int id, Student student) {
        student.setStudent_id(id);
        return  studentRepo.save(student);
    }

    @Override
    public String deleteid(int id) {
        studentRepo.deleteById(id);
        return "delete";
   }

    @Override
    public void deleteAll() {
        studentRepo.deleteAll();

    }


}
