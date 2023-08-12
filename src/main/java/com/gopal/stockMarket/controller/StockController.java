package com.gopal.stockMarket.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gopal.stockMarket.entities.Stock;
import com.gopal.stockMarket.service.impl.StockServiceImplementation;

@RestController
@RequestMapping("/stock")
public class StockController {
	
	@Autowired
	private StockServiceImplementation stockServiceImplementation;

	@GetMapping("/")
	public List<Stock> getAllStocks(){
		
		return stockServiceImplementation.getAllStock();
	}
	
	@GetMapping("/{id}")
	public Stock getStockById(@PathVariable int id){
		
		return stockServiceImplementation.getStockById(id);
	}
	
	@DeleteMapping("/{id}")
	public Stock deleteStockByid(@PathVariable int id){
		
		return stockServiceImplementation.deleteStock(id);
	}
	
	@PostMapping("/")
	public Stock createStock(@RequestBody Stock stock) {
		 return stockServiceImplementation.createStock(stock);
	}
}
