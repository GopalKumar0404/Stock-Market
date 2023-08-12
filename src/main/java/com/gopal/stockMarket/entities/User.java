package com.gopal.stockMarket.entities;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	int userId;
	String userName;
	String userEmail;
	List<Stock> stocks;
}
