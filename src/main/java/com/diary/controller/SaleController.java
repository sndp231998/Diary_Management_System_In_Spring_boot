package com.diary.controller;



import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.diary.entity.Sale;
import com.diary.service.SaleService;



@Controller
public class SaleController {

	
	private SaleService saleService;
	
	public SaleController(SaleService saleService) {
		super();
		this.saleService=saleService;
	}
	//babylist display 
	//handler method to handle list students and retuen mode and view
	@GetMapping("/sales")
	public String listSales(Model model) {
		model.addAttribute("sales",saleService.getAllSales());
		
		return "sales";
	}
	
	
	@GetMapping("/sales/new")
	public String createSaleForm(Model model) {
		
		// create student object to hold student form data
		Sale sale = new Sale();
		model.addAttribute("sale", sale);
		return "create_sale";
		
	}
	
	@PostMapping("/sales")
	public String saveSale(@ModelAttribute("sale")Sale sale ,BindingResult result ) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "edit_sale";
		}
		
		saleService.saveSale(sale);
		return "redirect:/sales";
	}
	
	@GetMapping("/sales/edit/{id}")
	public String editSaleForm(@PathVariable Long id, Model model) {
	model.addAttribute("sale",saleService.getSaleById(id));
	
	return "edit_sale";
	}
	
	//update
	@PostMapping("/sales/{id}")
	public String updateSale(@PathVariable Long id,
			 @Valid	@ModelAttribute("sale") Sale sale, BindingResult result,
		Model model) {
		
		if(result.hasErrors()) {
			System.out.println(result);
			return "edit_sale";
		}
		
		//get  from db by id
		Sale existingSale=saleService.getSaleById(id);
		existingSale.setId(id);
		existingSale.setFullname(sale.getFullname());
		existingSale.setItem(sale.getItem());
		existingSale.setAmount(sale.getAmount());
		existingSale.setQty(sale.getQty());
		existingSale.setRate(sale.getRate());
	
		saleService.updateSale(existingSale);
		return "redirect:/sales";
	}
	@GetMapping("/sales/{id}")
	public String deleteSale(@PathVariable Long id) {
		saleService.deleteSaleById(id);
		
		return "redirect:/sales";
	}
		
	}
	
	

