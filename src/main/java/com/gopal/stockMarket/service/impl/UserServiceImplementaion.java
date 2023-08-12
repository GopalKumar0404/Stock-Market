package com.gopal.stockMarket.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gopal.stockMarket.entities.Stock;
import com.gopal.stockMarket.entities.User;
import com.gopal.stockMarket.service.UserService;

@Service
public class UserServiceImplementaion implements UserService {

	static List<User> users = new ArrayList<User>();
	static User dummyUser;

	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return createUserDynamic(user);
	}

	@Override
	public User updateUser(User user, int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return getUsers();
	}

	@Override
	public User getUserById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buyStock(int stockId, int userId) {
		// TODO Auto-generated method stub

		return buyStockById(stockId, userId);
	}

	@Override
	public String sellStock(int stockId, int userId) {
		// TODO Auto-generated method stub
		return sellStockById(stockId,userId);
	}

	public User createUserDynamic(User user) {
		users.add(user);
		return user;
	}

	public List<User> getUsers() {
		return users;
	}

	public String buyStockById(int stockId, int userId) {

		return "Stock Buying Successful";
	}

	public String sellStockById(int stockId, int userId) {

		return "Stock Selling Successful";
	}

	static {
		List<Stock> s = new ArrayList<Stock>();
		s.add(StockServiceImplementation.stocks.get(0));
		s.add(StockServiceImplementation.stocks.get(1));
		dummyUser = new User(00, "Nof Found", "NA", s);
		User s1 = new User(1001, "Gopal", "gopal@bits.com", s);
		User s2 = new User(1002, "Sachin", "Sachin@bits.com", s);
		User s3 = new User(1003, "Sakshi", "Sakshi@bits.com", s);
		User s4 = new User(1004, "Harsha", "Harsha@bits.com", s);

		users.add(s1);
		users.add(s2);
		users.add(s3);
		users.add(s4);

	}
}
