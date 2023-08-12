package com.gopal.stockMarket.service;

import java.util.List;

import com.gopal.stockMarket.entities.Stock;

public interface StockService {

	List<Stock> getAllStock();
	Stock getStockById(int Id);
	Stock createStock(Stock stock);
	Stock deleteStock(int Id);
	Stock updateStock(Stock stock, int Id);
	
	
}
