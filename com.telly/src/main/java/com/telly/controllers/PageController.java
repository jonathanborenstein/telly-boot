package com.telly.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class PageController {
	

	
	@RequestMapping("/")
	ModelAndView home(ModelAndView modelAndView){
		
				
		modelAndView.setViewName("app.homepage");

		
		
		return modelAndView;
	}
	
	@RequestMapping("/403")
	ModelAndView accessDenied(ModelAndView modelAndView) {

		modelAndView.setViewName("redirect:/");
		return modelAndView;
	
}
}