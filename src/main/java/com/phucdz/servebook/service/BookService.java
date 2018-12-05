package com.phucdz.servebook.service;

import com.phucdz.servebook.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.awt.*;
import java.util.List;

public interface BookService {
    Book create(Book book);

    Book delete(int id);

    List<Book> findAll();

    Book findById(int id);

    Book update(Book book);
}
