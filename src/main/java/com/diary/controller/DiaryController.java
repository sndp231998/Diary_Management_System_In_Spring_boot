//package com.diary.controller;
//
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.diary.entity.Purchase;
//import com.diary.service.PurchaseService;
//
//
//
//@Controller
//public class DiaryController {
//
//	
//	private PurchaseService purchaseService;
//	
//	public void PurchaseController(PurchaseService purchaseService) {
//		
//		
//		this.purchaseService=purchaseService;
//	}
//	
//	@GetMapping("/purchases")
//	public String listPurchases(Model model) {
//		model.addAttribute("purchases",purchaseService.getAllPurchases());
//		
//		return "purchases";
//	}
//	
//	
//	@GetMapping("/purchases/new")
//	public String createPurchaseForm(Model model) {
//		
//		
//		Purchase purchase = new Purchase();
//		model.addAttribute("purchase", purchase);
//		return "create_purchase";
//		
//	}
//	
//	@PostMapping("/purchases")
//	public String saveBaby(@ModelAttribute("purchase")Purchase purchase ) {
//		purchaseService.savePurchase(purchase);
//		return "redirect:/purchases";
//	}
//	
//	@GetMapping("/purchases/edit/{id}")
//	public String editPurchaseForm(@PathVariable Long id, Model model) {
//	model.addAttribute("purchase",purchaseService.getPurchaseById(id));
//	
//	return "edit_purchase";
//	}
//	
//	//update
//	@PostMapping("/purchases/{id}")
//	public String updatePurchase(@PathVariable Long id,
//		@ModelAttribute("purchase") Purchase purchase,
//		Model model) {
//		//get baby from db by id
//		Purchase existingPurchase=purchaseService.getPurchaseById(id);
//		existingPurchase.setId(id);
//		existingPurchase.setFullname(purchase.getFullname());
//		existingPurchase.setItem(purchase.getItem());
//		existingPurchase.setAmount(purchase.getAmount());
//		
//	
//		purchaseService.savePurchase(existingPurchase);
//		return "redirect:/purchases";
//	}
//	@GetMapping("/purchases/{id}")
//	public String deletePurchase(@PathVariable Long id) {
//		purchaseService.deletePurchaseById(id);
//		
//		return "redirect:/purchases";
//	}
//		
//	}
//	
//	
//
package com.diary.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.diary.entity.Purchase;
import com.diary.service.PurchaseService;

@Controller
public class DiaryController {
	
	
	private PurchaseService purchaseService;
	
	public DiaryController (PurchaseService purchaseService) {
		super();
		this.purchaseService=purchaseService;
	}
	
	@GetMapping("/purchases")
	public String listPurchase(Model model) {
		model.addAttribute("purchases",purchaseService.getAllPurchases());
		
		return "purchases";
	}
	
	@GetMapping("/purchases/new")
	public String createPurchaseForm(Model model){
		
		// create student object to hold student form data
		Purchase purchase = new Purchase();
		model.addAttribute("purchase", purchase);
		return "create_purchase";
		
	}
	
	
	@PostMapping("/purchases")
	public String savePurchase(@ Valid @ModelAttribute("purchase")Purchase purchase ,BindingResult result) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "edit_purchase";
		}
		purchaseService.savePurchase(purchase);
		return "redirect:/purchases";
	}
	@GetMapping("/purchases/edit/{id}")
	public String editPurchaseForm(@PathVariable Long id, Model model) {
	model.addAttribute("purchase",purchaseService.getPurchaseById(id));
	
	return "edit_purchase";
	}
	@PostMapping("/purchases/{id}")
	public String updatePurchase(@PathVariable Long id,
	 @Valid @ModelAttribute("purchase") Purchase purchase, BindingResult result,
		Model model) {
		if(result.hasErrors()) {
			System.out.println(result);
			return "edit_purchase";
		}
		//get purchase from db by id
		Purchase existingPurchase=purchaseService.getPurchaseById(id);
		existingPurchase.setId(id);
		existingPurchase.setFullname(purchase.getFullname());
		existingPurchase.setItem(purchase.getItem());
		existingPurchase.setAmount(purchase.getAmount());
		existingPurchase.setQty(purchase.getQty());
		existingPurchase.setRate(purchase.getRate());
		
	
		purchaseService.savePurchase(existingPurchase);
		return "redirect:/purchases";
	}
	
	@GetMapping("/purchases/{id}")
	public String deletePurchase(@PathVariable Long id) {
		purchaseService.deletePurchaseById(id);
		
		return "redirect:/purchases";
	}
	

}
