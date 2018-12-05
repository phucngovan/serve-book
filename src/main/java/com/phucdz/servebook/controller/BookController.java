package com.phucdz.servebook.controller;

import com.phucdz.servebook.model.Book;
import com.phucdz.servebook.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/books"})
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Book create(@RequestBody Book book){
        return bookService.create(book);
    }

    @GetMapping(path = {"/{id}"})
    public Book findOne(@PathVariable("id") int id){
        return bookService.findById(id);
    }

    @PutMapping(path = {"/{id}"})
    public Book update(@RequestBody Book book){
        return bookService.update(book);
    }

    @DeleteMapping(path ={"/{id}"})
    public Book delete(@PathVariable("id") int id) {
        return bookService.delete(id);
    }

    @GetMapping
    public List<Book> findAll( ){
        return  bookService.findAll();
    }
}
