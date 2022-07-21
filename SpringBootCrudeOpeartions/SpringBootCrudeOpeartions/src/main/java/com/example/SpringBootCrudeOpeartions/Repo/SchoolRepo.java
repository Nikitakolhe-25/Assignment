package com.example.SpringBootCrudeOpeartions.Repo;

import com.example.SpringBootCrudeOpeartions.Entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer> {
}
