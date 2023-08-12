package com.gopal.stockMarket.service;

import java.util.List;

import com.gopal.stockMarket.entities.User;

public interface UserService {

	User createUser(User user);
	User updateUser(User user, int Id);
	User deleteUser( User user);
	List<User> getAllUsers();
	User getUserById(int Id);
	
	String buyStock(int stockId, int userId);
	String sellStock(int stockId, int userId);
}
