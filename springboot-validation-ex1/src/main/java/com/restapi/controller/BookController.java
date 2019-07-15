package com.restapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.entity.Book;
import com.restapi.repository.BookRepository;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	private BookRepository repository;

	// Find
	@GetMapping("/books")
	List<Book> findAll() {
		return (List<Book>) repository.findAll();
	}

	// Save
	@PostMapping("/book")
	@ResponseStatus(HttpStatus.CREATED)
	public Book newBook(@Valid @RequestBody Book newBook) {
		return repository.save(newBook);
	}
}
