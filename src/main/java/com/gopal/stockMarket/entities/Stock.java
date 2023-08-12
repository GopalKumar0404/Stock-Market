package com.gopal.stockMarket.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
	
	int id;
	String companyName;
	String symbol;
	double lastClosingPrice;
	double currentPrice;

}
