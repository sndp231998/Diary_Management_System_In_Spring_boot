package com.diary.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.diary.entity.Purchase;
import com.diary.repository.PurchaseRepository;
import com.diary.service.PurchaseService;



@Service
public class PurchaseServiceImpl implements PurchaseService {

	private PurchaseRepository purchaseRepository;
	
	public PurchaseServiceImpl(PurchaseRepository purchaseRepository) {
		super();
		this.purchaseRepository = purchaseRepository;
	}

	@Override
	public List<Purchase> getAllPurchases() {
		
		return purchaseRepository.findAll();
	}

	@Override
	public Purchase savePurchase(Purchase purchase) {
		
		return purchaseRepository.save(purchase);
	}

	@Override
	public Purchase getPurchaseById(Long id) {
		
		return purchaseRepository.findById(id).get();
	}

	@Override
	public Purchase updatePurchase(Purchase purchase) {
		
		return purchaseRepository.save(purchase);
	}

	@Override
	public void deletePurchaseById(Long id) {
		
		
		purchaseRepository.deleteById(id);
	}


}
