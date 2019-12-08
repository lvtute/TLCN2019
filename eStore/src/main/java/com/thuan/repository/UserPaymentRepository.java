package com.thuan.repository;

import org.springframework.data.repository.CrudRepository;

import com.thuan.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {

	
}
