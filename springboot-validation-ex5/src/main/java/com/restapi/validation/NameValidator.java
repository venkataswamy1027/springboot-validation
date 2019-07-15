package com.restapi.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.restapi.constant.ValidatorConstants;

public class NameValidator implements ConstraintValidator<ValidName, String> {
	private static final Logger LOGGER = LoggerFactory.getLogger(NameValidator.class);

	@Override
	public boolean isValid(String name, ConstraintValidatorContext context) {
		if (name == null || name.isEmpty()) {
			return false;
		} else {
			String nameValue = name.trim();
			LOGGER.info("nameValue {}", nameValue);
			if (nameValue.isEmpty() || name.length() < 4 || !nameValue.matches(ValidatorConstants.ENTITY_NAME))
				return false;
			else
				return true;
		}
	}

}
