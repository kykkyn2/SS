package com.springstory.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springstory.service.UserService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = { "/index.htm", "/", "" }, method = RequestMethod.GET)
	public String siteIndex(HttpServletRequest request, Model model) {
		
		String message = "index??";
		model.addAttribute("message", message );
		
		return "home";
	}
	
	@RequestMapping(value = "/test.htm", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		String message = userService.getHelloMessage();
		
		model.addAttribute("message", message );
		
		return "home";
	}

		
}
