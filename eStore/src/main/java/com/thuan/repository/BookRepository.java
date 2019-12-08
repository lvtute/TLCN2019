package com.thuan.repository;



import org.springframework.data.repository.CrudRepository;

import com.thuan.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	

}
