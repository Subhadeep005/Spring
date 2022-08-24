package com.codingraja.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeUrlController {
		
		@RequestMapping("/home")
		public String landingPage(){
			return "home";
		}
}
