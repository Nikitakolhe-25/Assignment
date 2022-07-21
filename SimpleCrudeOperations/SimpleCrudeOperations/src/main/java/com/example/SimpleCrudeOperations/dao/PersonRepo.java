package com.example.SimpleCrudeOperations.dao;

import com.example.SimpleCrudeOperations.Model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonRepo extends CrudRepository<Person, Integer>
{

}
