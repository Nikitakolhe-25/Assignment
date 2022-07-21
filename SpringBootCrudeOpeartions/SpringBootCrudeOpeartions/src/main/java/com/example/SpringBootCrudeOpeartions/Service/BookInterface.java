package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookInterface {
    Book post(Book book);

    List<Book> getall();

    Optional<Book> getId(int id);
}
