package com.example.SimpleCrudeOperations.Service;

import com.example.SimpleCrudeOperations.Model.Person;
import com.example.SimpleCrudeOperations.dao.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService  implements PersonInterface
{
    @Autowired
    public PersonRepo personRepo;

    @Override
    public Person save(Person person) {
        return personRepo.save(person);
    }

    @Override
    public Person getAllData() {
        return (Person) personRepo.findAll();
    }

    @Override
    public void deleteall()
    {
        personRepo.deleteAll();

    }

    @Override
    public Person update(int id, Person person)
    {
        person.setAge(id);
        return personRepo.save(person);
    }
}
