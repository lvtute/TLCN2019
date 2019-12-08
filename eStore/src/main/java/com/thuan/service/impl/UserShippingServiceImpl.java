package com.thuan.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thuan.domain.UserShipping;
import com.thuan.repository.UserShippingRepository;
import com.thuan.service.UserShippingService;

@Service
public class UserShippingServiceImpl implements UserShippingService {

	@Autowired
	private UserShippingRepository userShippingRepository;
	
	@Override
	public UserShipping findById(Long id) {
		return userShippingRepository.findOne(id);
	}

	@Override
	public void removeById(Long id) {
		userShippingRepository.delete(id);
	}

	
	
}
