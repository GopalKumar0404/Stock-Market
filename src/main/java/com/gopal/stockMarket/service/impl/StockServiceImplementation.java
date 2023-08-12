package com.gopal.stockMarket.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.gopal.stockMarket.entities.Stock;
import com.gopal.stockMarket.service.StockService;

@Service
public class StockServiceImplementation implements StockService {
	
	static List<Stock> stocks = new ArrayList<Stock>();
	static Stock dummyStock;

	@Override
	public List<Stock> getAllStock() {
		
		
		return createAndGetStock();
	}

	@Override
	public Stock getStockById(int Id) {
		// TODO Auto-generated method stub
		return findStockById(Id);
	}

	@Override
	public Stock createStock(Stock stock) {
		// TODO Auto-generated method stub
		return addStock(stock);
	}

	private Stock addStock(Stock stock) {
		stocks.add(stock);
		
		return stock;
	}

	@Override
	public Stock deleteStock(int Id) {
		// TODO Auto-generated method stub
		return deleteStockById(Id);
	}

	@Override
	public Stock updateStock(Stock stock, int Id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Stock> createAndGetStock(){
		
		
		return stocks;
	}
	
	public Stock findStockById(int id) {
		
		
		
		for(Stock s: stocks) {
			if(s.getId() == id) {
				return s;
			}
		}
		
		return dummyStock;
	}
	

	public Stock deleteStockById(int id) {
		
		
		System.out.println("delete function calling");
		for(Stock s: stocks) {
			if(s.getId() == id) {				
				stocks.remove(s);
				return s;
			}
		}
		
		return dummyStock;
	}
	
	static {
		dummyStock = new Stock(00,"Nof Found","NA",00.00,00.00);
		Stock s1 = new Stock(101,"Reliance","Rel",109.00,110.10);
		Stock s2 = new Stock(102,"wipro","W",103.00,111.10);
		Stock s3 = new Stock(103,"bits","B",105.00,130.10);
		Stock s4 = new Stock(104,"Airtel","Air",102.00,210.10);
		Stock s5 = new Stock(105,"Tata","T",106.00,140.10);
		Stock s6 = new Stock(106,"Infosys","Inf",139.00,120.10);
		
		
		stocks.add(s1);
		stocks.add(s2);
		stocks.add(s3);
		stocks.add(s4);
		stocks.add(s5);
		stocks.add(s6);
	}

}
