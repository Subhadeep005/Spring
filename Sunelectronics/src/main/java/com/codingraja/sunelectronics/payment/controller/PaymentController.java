package com.codingraja.sunelectronics.payment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	private static final String PAYMENT_OPTION_PAGE = "payment/payment";

	@GetMapping("")
	public ModelAndView paymentOptionPage() {
		return new ModelAndView(PAYMENT_OPTION_PAGE);
	}
}
