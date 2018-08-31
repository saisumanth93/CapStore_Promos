package com.cg.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.beans.Product;
import com.cg.spring.service.IProductService;

@RestController
public class ProductController {

	@Autowired
	IProductService service;
	@RequestMapping("/camera1")
	public Product camera() {
		return service.showcamera();
		
	}
	@RequestMapping("/camera2")
	public Product cameras() {
		return service.showcameras();
		
	}
	@RequestMapping("/phone1")
	public Product phone() {
		return service.showphone();
		
	}
	@RequestMapping("/phone2")
	public Product phones() {
		return service.showphones();
		
	}
	@RequestMapping("/shoe1")
	public Product shoe() {
		return service.showshoe();
		
	}
	@RequestMapping("/shoe2")
	public Product shoes() {
		return service.showshoes();
		
	}
	
	
	
	
	
}
