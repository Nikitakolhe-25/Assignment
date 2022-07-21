package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.School;

import java.util.List;
import java.util.Optional;

public interface SchoolInterface {
    School post(School school);

    List<School> get();

    Optional<School> getbyid(int id);

    School updateData(int id, School school);

    void deleteall();

    String deleteByID(int id);
}
