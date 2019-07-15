package com.restapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.restapi.entity.Book;

public interface BookRepository extends CrudRepository<Book, Long>{

}
