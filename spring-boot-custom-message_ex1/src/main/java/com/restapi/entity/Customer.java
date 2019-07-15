package com.restapi.entity;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import lombok.Data;

@Data
public class Customer {
	@NotEmpty(message = "{name.not.empty}")
	private String name;
	@Email(message = "{email.not.valid}")
	private String email;
	@Min(value = 21, message = "{age.adult.only}")
	private int age;
}
