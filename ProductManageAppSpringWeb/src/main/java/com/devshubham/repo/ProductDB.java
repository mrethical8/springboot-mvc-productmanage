package com.devshubham.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devshubham.model.Product;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer>{
	Product findByName(String name);
}
 