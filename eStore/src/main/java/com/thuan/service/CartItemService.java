package com.thuan.service;

import java.util.List;

import com.thuan.domain.Book;
import com.thuan.domain.CartItem;
import com.thuan.domain.ShoppingCart;
import com.thuan.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	CartItem updateCartItem(CartItem cartItem);
	CartItem addBookToCartItem(Book book, User user, int qty);
}
