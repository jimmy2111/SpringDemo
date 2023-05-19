package com.einfochips.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {

	@GetMapping("/")
	public ModelAndView getHomePage() {
		return new ModelAndView("home");
	}
	@GetMapping("/add")
	public ModelAndView getAddPage() {
		return new ModelAndView("add");
	}
}
