package com.lcwr.swagger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwr.swagger.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
