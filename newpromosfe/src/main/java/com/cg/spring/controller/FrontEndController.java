package com.cg.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cg.spring.bean.Product;

@RestController
public class FrontEndController {

	
@RequestMapping("/camera1")
	public ModelAndView camera() {
		RestTemplate rt = new RestTemplate();
		Product product =rt.getForObject("http://localhost:9191/camera1", Product.class);
		
		return new ModelAndView("camera1","cust",product);
		
	}
@RequestMapping("/camera2")
public ModelAndView cameras() {
	RestTemplate rt = new RestTemplate();
	Product products =rt.getForObject("http://localhost:9191/camera2", Product.class);

	return new ModelAndView("camera2","customer",products);
	
}
@RequestMapping("/phone1")
public ModelAndView phone() {
	RestTemplate rt = new RestTemplate();
	Product products =rt.getForObject("http://localhost:9191/phone1", Product.class);

	return new ModelAndView("phone1","phone",products);
	
}

@RequestMapping("/phone2")
public ModelAndView phones() {
	RestTemplate rt = new RestTemplate();
	Product products =rt.getForObject("http://localhost:9191/phone2", Product.class);

	return new ModelAndView("phone2","phones",products);
	
}
@RequestMapping("/shoe1")
public ModelAndView shoe() {
	RestTemplate rt = new RestTemplate();
	Product products =rt.getForObject("http://localhost:9191/shoe1", Product.class);

	return new ModelAndView("shoe1","shoe",products);
	
}
@RequestMapping("/shoe2")
public ModelAndView shoes() {
	RestTemplate rt = new RestTemplate();
	Product products =rt.getForObject("http://localhost:9191/shoe2", Product.class);

	return new ModelAndView("shoe2","shoes",products);
	
}
	
}
