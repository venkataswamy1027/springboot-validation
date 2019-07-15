package com.restapi.validation.constraints;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.restapi.validation.interfaces.ContactNumberConstraint;

public class ContactNumberValidator implements ConstraintValidator<ContactNumberConstraint, String> {
	public void initialize(ContactNumberConstraint constraint) {
	}

	public boolean isValid(String contactField, ConstraintValidatorContext context) {
		return contactField != null && contactField.matches("[0-9]+") && (contactField.length() > 8)
				&& (contactField.length() < 14);
	}
}