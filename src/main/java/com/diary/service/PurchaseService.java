package com.diary.service;



import java.util.List;

import com.diary.entity.Purchase;


public interface PurchaseService {

	List<Purchase>getAllPurchases();
	

	Purchase savePurchase(Purchase purchase);
//----------------------
	
	Purchase getPurchaseById(Long id);
	
	Purchase updatePurchase(Purchase purchase);
	
	void deletePurchaseById(Long id);
	
	

}
