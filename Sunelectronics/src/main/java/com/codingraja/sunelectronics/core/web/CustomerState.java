package com.codingraja.sunelectronics.core.web;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.codingraja.sunelectronics.core.domain.Customer;

@Component
public class CustomerState {

	private CustomerState() {
		// Do Nothing
	}

	private static final String CUSTOMER_STATE = "customer";

	public static Customer getCustomer(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute(CUSTOMER_STATE) == null) {
			Customer customer = new Customer();
			customer.setFirstName(getCustomerSessionId(request));
			customer.setCustomerLocale(Locale.ENGLISH);
			customer.setNewsletter(false);
			customer.setType("ROLE_ANONYMOUS");
			return customer;
		} else {
			return (Customer) session.getAttribute(CUSTOMER_STATE);
		}
	}

	public static void setCustomer(Customer customer, HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.setAttribute(CUSTOMER_STATE, customer);
	}

	public static String getCustomerSessionId(HttpServletRequest request) {
		return request.getSession().getId();
	}

}
