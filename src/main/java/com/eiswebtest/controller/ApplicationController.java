package com.eiswebtest.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/")
public class ApplicationController {
 
	@RequestMapping(value="/Test", method = RequestMethod.GET)
	public String welcome(ModelMap model) { 
		model.addAttribute("msgArgument", "You launched java web application, the execution is: Success!");

		return "index";
 
	}
 
	@RequestMapping(value="/Print/{arg}", method = RequestMethod.GET)
	public String welcomeName(@PathVariable String arg, ModelMap model) {
		model.addAttribute("msgArgument", "You launched java web application, the execution is: " + arg);
		
		return "index";
	}
 
}
