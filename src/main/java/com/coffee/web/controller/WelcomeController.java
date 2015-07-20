package com.coffee.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	static final Logger logger = LoggerFactory.getLogger(WelcomeController.class);

	@RequestMapping("index.do")
	public String index() {
		logger.debug("ok.");
		return "index";
	}
}
