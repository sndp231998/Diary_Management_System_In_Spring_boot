package com.diary.service.impl;


import java.util.List;

import org.springframework.stereotype.Service;

import com.diary.entity.Sale;
import com.diary.repository.SaleRepository;
import com.diary.service.SaleService;


@Service
public class SaleServiceImpl implements SaleService {

	private SaleRepository saleRepository;
	
	public SaleServiceImpl(SaleRepository saleRepository) {
		super();
		this.saleRepository = saleRepository;
	}

	@Override
	public List<Sale>getAllSales() {
		
		return saleRepository.findAll();
	}

	@Override
	public Sale saveSale(Sale sale) {
		
		return saleRepository.save(sale);
	}

	@Override
	public Sale getSaleById(Long id) {
		
		return saleRepository.findById(id).get();
	}

	
	@Override
	public void deleteSaleById(Long id) {
		
		
		saleRepository.deleteById(id);
	}

	@Override
	public Sale updateSale(Sale sale) {
		// TODO Auto-generated method stub
		return  saleRepository.save(sale);
	}

}
