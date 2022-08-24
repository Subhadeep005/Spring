package com.codingraja.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codingraja.spring.domain.Customer;
import com.codingraja.spring.dto.CustomerDto;
import com.codingraja.spring.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	private CustomerService CustomerService;

	@Autowired
	public CustomerController(com.codingraja.spring.service.CustomerService customerService) {
		super();
		CustomerService = customerService;
	}

	@RequestMapping("/register")
	public ModelAndView customerRegistrationPage() {
		return new ModelAndView("register", "customerDto", new CustomerDto());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView processCustomerRegistration(@ModelAttribute @Validated CustomerDto customerDto,
			BindingResult result) {
		if (result.hasErrors())
			return new ModelAndView("register", "customerDto", customerDto);
		else {
			String pass1 = customerDto.getPassword();
			String pass2 = customerDto.getConfirmPassword();
			if (!(pass1.equals(pass2))) {
				result.rejectValue("confirmPassword", "confirmPassword.invalid",
						"Password and Confirm Password must be same");
				return new ModelAndView("register", "customerDto", customerDto);
			}
			if (customerDto.getId() != null)
				CustomerService.updateCustomer(customerDto);
			else
				CustomerService.saveCustomer(customerDto);
			return new ModelAndView("redirect:/customer/all");
		}
	}

	@RequestMapping("/all")
	public ModelAndView customerListingPage() {
		return new ModelAndView("customerListPage", "customerList", CustomerService.findAllCustomers());
	}

	@RequestMapping("/{id}/delete")
	public String deleteCustomer(@PathVariable long id) {
		CustomerService.deleteCustomerById(id);
		return "redirect:/customer/all";
	}

	@RequestMapping("/{id}/update")
	public ModelAndView updateCustomer(@PathVariable long id) {
		Customer customer = CustomerService.findCustomerById(id);
		CustomerDto customerDto = new CustomerDto();
		customerDto.setId(customer.getId());
		customerDto.setFirstName(customer.getFirstName());
		customerDto.setLastName(customer.getLastName());
		customerDto.setEmail(customer.getEmail());
		customerDto.setMobile(customer.getMobile());

		return new ModelAndView("register", "customerDto", customerDto);
	}
}
