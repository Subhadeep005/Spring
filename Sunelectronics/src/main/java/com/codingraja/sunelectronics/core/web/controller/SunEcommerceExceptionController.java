package com.codingraja.sunelectronics.core.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class SunEcommerceExceptionController {
	private static final Logger LOGGER = Logger.getLogger(SunEcommerceExceptionController.class);

	@GetMapping("/404")
	public String pageNotFoundErrorPage() {
		LOGGER.error("Page Not Found Exception is Ocuurred!");
		return "error/404";
	}

	@GetMapping("/405")
	public String methodNotSupportedErrorPage() {
		LOGGER.error("Method Not Supported Exception is Ocuurred!");
		return "error/405";
	}

	@GetMapping("/500")
	public String jspCompilationErrorPage() {
		LOGGER.error("JSP Compilation Exception is Ocuurred!");
		return "error/500";
	}
}
