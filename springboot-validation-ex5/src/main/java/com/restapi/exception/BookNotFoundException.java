package com.restapi.exception;

public class BookNotFoundException extends RuntimeException {
	public BookNotFoundException(Long id) {
		super();
	}

	private static final long serialVersionUID = 1L;

}
