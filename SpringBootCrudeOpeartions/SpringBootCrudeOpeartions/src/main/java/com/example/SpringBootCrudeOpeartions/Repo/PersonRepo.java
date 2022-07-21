package com.example.SpringBootCrudeOpeartions.Repo;

import com.example.SpringBootCrudeOpeartions.Entity.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends CrudRepository<Person, Integer> {
}
