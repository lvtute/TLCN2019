package com.bookstore.service;


import com.bookstore.domain.Order;

import com.bookstore.domain.ShoppingCart;
import com.bookstore.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
