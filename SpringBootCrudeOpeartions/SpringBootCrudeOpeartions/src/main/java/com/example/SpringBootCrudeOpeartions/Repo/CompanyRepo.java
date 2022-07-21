package com.example.SpringBootCrudeOpeartions.Repo;

import com.example.SpringBootCrudeOpeartions.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepo extends JpaRepository<Company, Integer> {
}
