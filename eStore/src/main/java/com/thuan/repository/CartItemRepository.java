package com.thuan.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.thuan.domain.CartItem;
import com.thuan.domain.ShoppingCart;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {

	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
}
