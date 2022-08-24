package com.codingraja.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codingraja.spring.domain.CustomerDto;
import com.codingraja.spring.validator.CustomerDtoValidator;

@Controller
public class CustomerController {

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		System.out.println("@InitBinder");
		binder.addValidators(new CustomerDtoValidator());
	}

	@RequestMapping("/customer/register")
	public ModelAndView customerRegistrationPage() {
		return new ModelAndView("register", "customerDto", new CustomerDto());
	}

	@RequestMapping(value = "/customer/register", method = RequestMethod.POST)
	public ModelAndView processCustomerRegistration(@ModelAttribute @Validated CustomerDto customerDto,
			BindingResult result) {

		if (result.hasErrors()) {
			System.out.println("hasErrors");
			return new ModelAndView("register", "customerDto", customerDto);
		} else

			return new ModelAndView("welcome");
	}
}
