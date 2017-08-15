package com.java.springs.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	private static Logger log = Logger.getLogger(WebController.class);

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		log.info("execute Index Method");
		return "index";
	}

	@RequestMapping(value = "/redirect", method = RequestMethod.GET)
	public String redirect() {
		log.info("execute redirect Method");
		return "redirect:finalPage";
	}

	@RequestMapping(value = "/finalPage", method = RequestMethod.GET)
	public String finalPage() {
		log.info("execute final page Method");
		return "final";
	}

	@RequestMapping(value = "/staticPage", method = RequestMethod.GET)
	public String pageRedirect() {
		log.info("execute redirect to static page Method");
		return "redirect:/pages/final.htm";
	}
}
