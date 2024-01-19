package com.example.demo.services;

import com.example.demo.dao.cartDao;
import com.example.demo.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cartService {
	@Autowired
	private cartDao cartDao;

	public Cart addCart(Cart cart) {
		return cartDao.addCart(cart);
	}
	
	public List<Cart> getCarts() {
		return this.cartDao.getCarts();
	}

	public void updateCart(Cart cart) {
		cartDao.updateCart(cart);
	}

	public void deleteCart(Cart cart) {
		cartDao.deleteCart(cart);
	}


}
