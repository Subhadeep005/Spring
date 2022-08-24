package com.codingraja.spring.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.codingraja.spring.domain.CustomerDto;

public class CustomerDtoValidator implements Validator {

	public boolean supports(Class<?> clazz) {
		System.out.println("supports");
		return CustomerDto.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		System.out.println("validate");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "customer.firstName.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "customer.lastName.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "customer.email.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobile", "customer.mobile.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "customer.password.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "customer.confirmPassword.required");

		CustomerDto customerDto = (CustomerDto) target;
		if (Long.toString(customerDto.getMobile()).length() < 10) {
			errors.rejectValue("mobile", "customer.mobile.required");
		}
	}

}
