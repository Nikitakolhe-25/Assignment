package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.School;
import com.example.SpringBootCrudeOpeartions.Repo.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService implements SchoolInterface
{
    @Autowired
    public SchoolRepo schoolRepo;

    @Override
    public School post(School school) {
        return schoolRepo.save(school);
    }

    @Override
    public List<School> get() {
        return schoolRepo.findAll();
    }

    @Override
    public Optional<School> getbyid(int id) {
        return schoolRepo.findById(id);
    }

    @Override
    public School updateData(int id, School school)
    {
        school.setId(id);

        return schoolRepo.save(school);
    }

    @Override
    public void deleteall()
    {
        schoolRepo.deleteAll();

    }

    @Override
    public String deleteByID(int id)
    {
        schoolRepo.deleteById(id);
        return "delete Sucessfully";
    }
}
