package com.phucdz.servebook.repository;

import com.phucdz.servebook.model.Book;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BookRepository extends PagingAndSortingRepository<Book, Integer> {

}
