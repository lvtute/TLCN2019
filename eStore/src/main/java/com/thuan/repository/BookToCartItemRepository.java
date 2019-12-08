package com.thuan.repository;

import org.springframework.data.repository.CrudRepository;

import com.thuan.domain.BookToCartItem;

public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {

}
