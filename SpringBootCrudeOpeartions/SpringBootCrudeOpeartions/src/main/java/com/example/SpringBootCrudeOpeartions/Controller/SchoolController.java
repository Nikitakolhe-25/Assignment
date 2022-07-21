package com.example.SpringBootCrudeOpeartions.Controller;

import com.example.SpringBootCrudeOpeartions.Entity.School;
import com.example.SpringBootCrudeOpeartions.Service.SchoolInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SchoolController
{
    @Autowired
    public SchoolInterface schoolInterface;

    @PostMapping("school/save")
    public School SaveSchool(@RequestBody School school)
    {
        return schoolInterface.post(school);
    }

    @GetMapping("school/get")
    public List<School> getAllData()
    {
        return schoolInterface.get();
    }

    @GetMapping("school/get{id}")
    public Optional<School> getDataById(@PathVariable int id)
    {

        return schoolInterface.getbyid(id);
    }

    @PutMapping("school/{id}")
    public School update(@PathVariable("id") int id, @RequestBody School school)
    {
        return schoolInterface.updateData(id, school);
    }

    @DeleteMapping("delete")
    public void deleteAll()
    {
        schoolInterface.deleteall();
    }

    @DeleteMapping("delete/{id}")
    public String DeleteById(@PathVariable("id") int id)
    {
        schoolInterface.deleteByID(id);
        return "delete Succesfully";
    }

}
