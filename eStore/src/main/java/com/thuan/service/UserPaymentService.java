package com.thuan.service;

import com.thuan.domain.UserPayment;

public interface UserPaymentService {

	UserPayment findById(Long id);
	void removeById(Long id);
}
