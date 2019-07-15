package com.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Student {
	@Id
	@GeneratedValue
	private Long id;
	@Size(min = 2, message = "Name should have atleast 2 characters")
	private String name;
	private String address;
}