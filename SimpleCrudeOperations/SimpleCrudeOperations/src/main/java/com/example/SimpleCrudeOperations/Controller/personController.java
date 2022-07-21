package com.example.SimpleCrudeOperations.Controller;

import com.example.SimpleCrudeOperations.Model.Person;
import com.example.SimpleCrudeOperations.Service.PersonInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class personController{
    @Autowired
    public PersonInterface personInterface;

    @PostMapping("/person/save")
    public Person savedata(@RequestBody Person person)
    {
        return personInterface.save(person);
    }

    @GetMapping("person/list")
    public Person getData()
    {
        return personInterface.getAllData();
    }
    @DeleteMapping("person/delete")
    public void deleteall()
    {
        personInterface.deleteall();
    }
    @PutMapping("person/put/{id}")
   public Person updateData(@PathVariable("id")int id, @RequestBody Person person)
   {
       return personInterface.update(id, person);
   }
}
