package com.restapi.validation.interfaces;

import javax.validation.Constraint;
import javax.validation.Payload;

import com.restapi.validation.constraints.ContactNumberValidator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = ContactNumberValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface ContactNumberConstraint {

	String message() default "Invalid phone number";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}