package com.cg.spring.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.beans.Product;

@Repository
public interface IProductRepo extends CrudRepository<Product, Integer> {

}
