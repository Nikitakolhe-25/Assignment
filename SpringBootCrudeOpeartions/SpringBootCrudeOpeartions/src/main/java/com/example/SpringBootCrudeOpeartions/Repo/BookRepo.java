package com.example.SpringBootCrudeOpeartions.Repo;

import com.example.SpringBootCrudeOpeartions.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {
}
