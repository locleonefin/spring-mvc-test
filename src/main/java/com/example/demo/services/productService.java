package com.example.demo.services;


import com.example.demo.dao.productDao;
import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class productService {
	@Autowired
	private productDao productDao;

	public List<Product> getProducts() {
		return this.productDao.getProducts();
	}

	public Product addProduct(Product product) {
		return this.productDao.addProduct(product);
	}

	public Product getProduct(int id) {
		return this.productDao.getProduct(id);
	}

	public Product updateProduct(int id, Product product) {
		product.setId(id);
		return this.productDao.updateProduct(product);
	}

	public boolean deleteProduct(int id) {
		return this.productDao.deletProduct(id);
	}


}
