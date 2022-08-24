package com.codingraja.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.codingraja.spring.domain.AddressDto;

@Controller
public class AddressController {
		
	@RequestMapping("/address")
	public ModelAndView addressPage(){
		return new ModelAndView("addressPage","addressDto",new AddressDto());
	}
	
	@RequestMapping(value="/address" ,method=RequestMethod.POST)
			public ModelAndView processCustomerAddress(@ModelAttribute AddressDto addressDto){
				addressDto.setId(11001);
				return new ModelAndView("addSave","address", addressDto);
			}
}
