package com.cg.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

	@RequestMapping("/")
	public String sayHello() {
		return "Home";
	}
	
	@RequestMapping("/shoes")
	public String sayHellos() {
		return "shoes";
	}
	@RequestMapping("/phone")
	public String sayphone() {
		return "phone";
	}

	@RequestMapping("/camera")
	public String saycams() {
		return "camera";
	}

	
}
