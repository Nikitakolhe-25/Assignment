package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonInterface {
    Person save(Person person);


    List<Person> getAll();

    Optional<Person> byID(int id);

    Person update(int id, Person person);

    void delete();

    String deleteById(int id);
}
