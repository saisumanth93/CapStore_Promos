package com.cg.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.beans.Product;
import com.cg.spring.repo.IProductRepo;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	IProductRepo repo;

	

	@Override
	public Product showcamera() {
		return repo.findById(1).get();
		
	}



	@Override
	public Product showcameras() {
		
		return repo.findById(2).get();
	}






	@Override
	public Product showphones() {
		
		return repo.findById(3).get();
	}
	
	
	@Override
	public Product showphone() {
		
		return repo.findById(4).get();
	}



	@Override
	public Product showshoe() {
		// TODO Auto-generated method stub
		return repo.findById(5).get();
	}



	@Override
	public Product showshoes() {
		return repo.findById(6).get();
	}

}
