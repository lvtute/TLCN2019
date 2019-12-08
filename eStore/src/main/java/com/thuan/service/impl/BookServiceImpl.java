package com.thuan.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thuan.domain.Book;
import com.thuan.repository.BookRepository;
import com.thuan.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;
	public List<Book> findAll(){
		return  (List<Book>) bookRepository.findAll();
	}
	@Override
	public Book findOne(Long id) {
		return bookRepository.findOne(id);
	}

}
