package com.thuan.service;


import java.util.List;

import com.thuan.domain.Book;

public interface BookService  {
	
	List<Book> findAll();
	
	Book findOne(Long id);
}
