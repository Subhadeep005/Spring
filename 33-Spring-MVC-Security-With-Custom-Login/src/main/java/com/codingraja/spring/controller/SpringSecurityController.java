package com.codingraja.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpringSecurityController {
	@GetMapping("/admin")
	public String adminPage(Model model){
		model.addAttribute("title", "This is Admin Page");
		model.addAttribute("message", "Only admin Can access this page");
		return "admin";
	}
	
	@GetMapping("/user")
	public String userPage(Model model){
		model.addAttribute("title", "This is User Page");
		model.addAttribute("message", "Admin and User both Can access this page");
		return "user";
	}
	
	@GetMapping("/login")
	public String loginPage(){
		return "login";
	}
}
