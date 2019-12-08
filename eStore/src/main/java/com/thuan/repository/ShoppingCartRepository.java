package com.thuan.repository;

import org.springframework.data.repository.CrudRepository;

import com.thuan.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

	
}
