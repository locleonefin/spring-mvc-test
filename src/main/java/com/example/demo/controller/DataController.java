package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.services.categoryService;
import com.example.demo.services.productService;
import com.example.demo.services.userService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DataController {
	private final static Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private userService userService;

	@Autowired
	private productService productService;

	@Autowired
	private categoryService categoryService;

	@GetMapping(value = "/products", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	@PostMapping(value = "/buyProduct", produces = MediaType.APPLICATION_JSON_VALUE)
	public Product buyProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
}
