package com.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty(message = "Please provide a name")
	private String name;
	@NotEmpty(message = "Please provide a author")
	private String author;
	@NotNull(message = "Please provide a price")
	private Double price;
}
