package com.example.SpringBootCrudeOpeartions.Service;

import com.example.SpringBootCrudeOpeartions.Entity.Book;
import com.example.SpringBootCrudeOpeartions.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService implements BookInterface

{
    @Autowired
    public BookRepo bookRepo;

    @Override
    public Book post(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public List<Book> getall() {
        return bookRepo.findAll();
    }

    @Override
    public Optional<Book> getId(int id) {
        return bookRepo.findById(id);
    }
}
