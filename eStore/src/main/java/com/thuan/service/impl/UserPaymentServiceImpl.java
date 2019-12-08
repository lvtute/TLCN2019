package com.thuan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thuan.domain.UserPayment;
import com.thuan.repository.UserPaymentRepository;
import com.thuan.service.UserPaymentService;

@Service
public class UserPaymentServiceImpl implements UserPaymentService {

	
	@Autowired
	private UserPaymentRepository userPaymentRepository;
	
	@Override
	public UserPayment findById(Long id) {
		return userPaymentRepository.findOne(id);
	}

	@Override
	public void removeById(Long id) {
		userPaymentRepository.delete(id);
		
	}

	
}
