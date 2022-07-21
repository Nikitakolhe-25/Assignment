package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Person;
import com.example.SpringBootCrudeOpeartions.Repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService implements PersonInterface
{
    @Autowired
    public PersonRepo personRepo;

    @Override
    public Person save(Person person) {
        return personRepo.save(person);
    }

    @Override
    public List<Person> getAll()
    {
       return (List<Person>) personRepo.findAll();

    }

    @Override
    public Optional<Person> byID(int id) {
      return   personRepo.findById(id);
    }

    @Override
    public Person update(int id, Person person)
    {
        person.setId(id);
        return personRepo.save(person);
    }

    @Override
    public void delete() {
        personRepo.deleteAll();

    }

    @Override
    public String deleteById(int id)
    {
        personRepo.deleteById(id);
        return "delete sucess";
    }


}
