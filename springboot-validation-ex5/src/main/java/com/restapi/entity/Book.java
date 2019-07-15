package com.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.restapi.validation.ValidName;

import lombok.Data;

@Entity
@Data
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	@NotEmpty
	@Size(min = 4, max = 36)
	@ValidName
	private String name;
	@NotEmpty(message = "Please provide a author")
	private String author;
	@NotNull(message = "Please provide a price")
	private Double price;
}
