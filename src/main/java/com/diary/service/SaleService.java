package com.diary.service;



import java.util.List;

import com.diary.entity.Sale;


public interface SaleService {

	List<Sale>getAllSales();
	
	//savebaby method
	Sale saveSale(Sale sale);
//----------------------
	
	Sale getSaleById(Long id);
	
	Sale updateSale(Sale sale);
	
	void deleteSaleById(Long id);
	
	

}
