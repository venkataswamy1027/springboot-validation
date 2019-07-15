package com.restapi.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class Employee {
	@Id
	@GeneratedValue
	private Long employeeId;
	@NotEmpty(message = "{employee.firstName.required}")
	private String firstName;
	@NotEmpty(message = "{employee.lastName.required}")
	private String lastName;
	@NotEmpty(message = "{employee.designation.required}")
	private String designation;
	@NotNull(message = "{employee.salary.required}")
	@Positive(message = "{employee.salary.invalid}")
	private Integer salary;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Past(message = "{employee.dateOfBirth.invalid}")
	private Date dateOfBirth;
}
