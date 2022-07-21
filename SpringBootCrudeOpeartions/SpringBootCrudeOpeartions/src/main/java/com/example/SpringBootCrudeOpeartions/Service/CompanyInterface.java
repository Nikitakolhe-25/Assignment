package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyInterface {
    Company post(Company company);

    List<Company> getall();

    Optional<Company> getID(int id);

    Company update(int id, Company company);

    void delete();

    String deleteall(int id);
}
