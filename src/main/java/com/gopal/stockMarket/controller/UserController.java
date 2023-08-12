package com.gopal.stockMarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopal.stockMarket.entities.User;
import com.gopal.stockMarket.service.impl.UserServiceImplementaion;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserServiceImplementaion userService;
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) {
		
		return userService.createUser(user);
		
	}
	
	@GetMapping("/")
	public List<User> getAllUser() {
		
		return userService.getAllUsers();
		
	}
	
	@PostMapping("/{userId}/stock/{stockId}/buy")
	public String buyStockById(@PathVariable int userId, @PathVariable int stockId) {
		
		return userService.buyStock(stockId, userId);
		
	}
	
	@PostMapping("/{userId}/stock/{stockId}/sell")
	public String sellStockById(@PathVariable int userId, @PathVariable int stockId) {
		
		return userService.sellStock(stockId, userId);
		
	}
}
