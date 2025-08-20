package com.devshubham.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.devshubham.model.Product;
import com.devshubham.repo.ProductDB; 

@Service
public class ProductService {

	@Autowired
	ProductDB db;
	
	public void addProduct(Product p) {

		db.save(p);
	}

	public List<Product> getAllProducts() {
		
		return db.findAll();
	}

	public Product getProduct(String name) {
		return db.findByName(name);
	}

	
}
