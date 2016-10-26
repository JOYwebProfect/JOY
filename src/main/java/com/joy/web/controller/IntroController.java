package com.joy.web.controller;


import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/")
public class IntroController {
	
	private static final Logger logger = LoggerFactory.getLogger(IntroController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(method = RequestMethod.GET)
	public String intro(Model model) {
		logger.info("intro controller");
		
		
	
		
		model.addAttribute("title", "joy web project strt" );
		
		return "intro/intro";
	}
	
}
