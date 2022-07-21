package com.example.SimpleCrudeOperations.Service;

import com.example.SimpleCrudeOperations.Model.Person;

public interface PersonInterface {
    Person save(Person person);

    Person getAllData();

    void deleteall();

    Person update(int id, Person person);
}
