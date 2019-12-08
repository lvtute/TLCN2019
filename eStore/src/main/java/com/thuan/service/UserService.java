package com.thuan.service;

import java.util.Set;

import com.thuan.domain.User;
import com.thuan.domain.UserBilling;
import com.thuan.domain.UserPayment;
import com.thuan.domain.UserShipping;
import com.thuan.domain.security.PasswordResetToken;
import com.thuan.domain.security.UserRole;

public interface UserService {

	
	PasswordResetToken getPasswordResetToken(final String token);
	
	void createPasswordResetTokenForUser(final User user, final String token);	
	
	User findByUsername(String username);
	
	User findByEmail(String email);
	
	User createUser(User user, Set<UserRole> userRoles) throws Exception;

	User save(User user);
	
	void updateUserBilling(UserBilling userBilling,UserPayment userPayment, User user);
	
	void setUserDefaultPayment(Long userPaymentId, User user);
	
	void updateUserShipping(UserShipping userShipping, User user);
	
	void setUserDefaultShipping(Long userShippingId, User user);
}
