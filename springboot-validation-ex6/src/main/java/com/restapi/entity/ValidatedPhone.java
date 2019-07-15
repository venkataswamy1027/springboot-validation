package com.restapi.entity;

import com.restapi.validation.interfaces.ContactNumberConstraint;

import lombok.Data;


@Data
public class ValidatedPhone {
	@ContactNumberConstraint
	private String phone;
}
