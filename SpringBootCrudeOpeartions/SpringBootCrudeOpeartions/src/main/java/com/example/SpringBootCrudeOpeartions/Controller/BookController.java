package com.example.SpringBootCrudeOpeartions.Controller;

import com.example.SpringBootCrudeOpeartions.Entity.Book;
import com.example.SpringBootCrudeOpeartions.Service.BookInterface;
import com.sun.source.tree.LambdaExpressionTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController
{
    @Autowired
    public BookInterface bookInterface;

    @PostMapping("book/post")
    public Book saveBook(@RequestBody Book book)
    {

        return  bookInterface.post(book);
    }

    @GetMapping("book/get")
    public List<Book> getAll()
    {

        return bookInterface.getall();
    }

    @GetMapping("book/get{id}")
    public Optional<Book> getById(@PathVariable int id)
    {
        return bookInterface.getId(id);
    }


}

