package com.example.SpringBootCrudeOpeartions.Controller;

import com.example.SpringBootCrudeOpeartions.Entity.Person;
import com.example.SpringBootCrudeOpeartions.Service.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PersonController {
    @Autowired
    public PersonInterface personInterface;

    @PostMapping("person/save")
    public Person save(@RequestBody Person person) {

        return personInterface.save(person);
    }

    @GetMapping("person/get")
    public List<Person> getAllData()
    {

        return personInterface.getAll();
    }
    @GetMapping("person/get/{id}")
    public Optional<Person> getById(@PathVariable int id)
    {
       return personInterface.byID(id);
    }

    @PutMapping("person/update/{id}")
   public  Person update(@PathVariable("id") int id, @RequestBody Person person)
   {
       return personInterface.update(id ,person);
   }

   @DeleteMapping("peron/delete")
   public void deleteAll()
   {
       personInterface.delete();

   }
   @DeleteMapping("person/delete/{id}")
   public String DeleteById(@PathVariable("id") int id)
   {
       personInterface.deleteById(id);
       return "delete";
   }

}



