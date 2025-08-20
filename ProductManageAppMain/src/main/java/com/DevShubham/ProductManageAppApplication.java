package com.DevShubham;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductManageAppApplication {

	public static void main(String[] args) {
	SpringApplication.run(ProductManageAppApplication.class, args);
		
	ProductService service = new ProductService();
	
//	service.addProduct(new Product("Dell Inspiron", "Laptop", "White Table", 2025));
//	service.addProduct(new Product("HP Pavilion", "Laptop", "Shelf", 2026));
//	service.addProduct(new Product("Samsung Monitor", "Monitor", "Black Table", 2024));
//	service.addProduct(new Product("Canon Printer", "Printer", "Brown Drawer", 2026));
//	service.addProduct(new Product("Apple Magic Mouse", "Mouse", "White Table", 2027));
//	service.addProduct(new Product("Logitech MX Master", "Mouse", "Black Drawer", 2026));
//	service.addProduct(new Product("Razer Blade", "Laptop", "Black Table", 2027));
//	service.addProduct(new Product("Bose Headphones", "Audio System", "Shelf", 2025));
//	service.addProduct(new Product("Sony Webcam", "Camera", "Black Drawer", 2026));
//	service.addProduct(new Product("TP-Link Router", "Networking", "Brown Drawer", 2025));
//	service.addProduct(new Product("Kingston SSD", "Storage", "Black Table", 2027));
//	service.addProduct(new Product("Amazon Echo Dot", "Audio System", "White Table", 2026));
//	service.addProduct(new Product("Apple iPad", "Tablet", "Brown Drawer", 2024));
//	service.addProduct(new Product("LG Ultrawide", "Monitor", "Black Table", 2025));
//	service.addProduct(new Product("Lenovo Legion 5 Pro", "Gaming Laptop", "Corner Desk", 2026));
	
	
	List<Product> products = service.getAllProducts();
	for(Product p : products) {
		System.out.println(p);
	} 
//	
//	System.out.println("=============================================");
//	
//	System.out.println("a Particular product");
//	
//	Product p = service.getProduct("Lenovo Legion 5 Pro");
//	
//	System.out.println(p);
	
//	System.out.println("=============================================");
//	
//	System.out.println("a Particular text");
//
//	 List<Product> prods = service.getProductWithText("black");
//	 for(Product product : prods) {
//			System.out.println(product);
//		}
	}

}
