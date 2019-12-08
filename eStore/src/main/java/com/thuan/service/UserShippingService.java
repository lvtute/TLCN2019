package com.thuan.service;

import com.thuan.domain.UserShipping;

public interface UserShippingService {

	UserShipping findById(Long id);
	
	void removeById(Long id);
}
