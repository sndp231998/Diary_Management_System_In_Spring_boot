//package com.diary.entity;
//
//
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="PRODUCT")
//
//public class Product {
//
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	private Long id;
//	
//	//null level attribute;
//	@Column(name="product_name",nullable=false)
//	private String productname;
//	
//	@Column(name="qty")
//	private float qty;
//	
//	@Column(name="rate")
//	private float rate;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getProductname() {
//		return productname;
//	}
//
//	public void setProductname(String productname) {
//		this.productname = productname;
//	}
//
//	public float getQty() {
//		return qty;
//	}
//
//	public void setQty(float qty) {
//		this.qty = qty;
//	}
//
//	public float getRate() {
//		return rate;
//	}
//
//	public void setRate(float rate) {
//		this.rate = rate;
//	}
//	
//
//
////	public Long getId() {
////		return id;
////	}
////
////	public void setId(Long id) {
////		this.id = id;
////	}
////
////	public String getFullname() {
////		return fullname;
////	}
////
////	public void setFullname(String fullname) {
////		this.fullname = fullname;
////	}
////
////	public String getItem() {
////		return item;
////	}
////
////	public void setItem(String item) {
////		this.item = item;
////	}
////
////	public int getAmount() {
////		return amount;
////	}
////
////	public void setAmount(int amount) {
////		this.amount = amount;
////	}
////
////	public String getPhone() {
////		return phone;
////	}
////
////	public void setPhone(String phone) {
////		this.phone = phone;
//	}
//
////	public Purchase(Long id, String fullname, String item, int amount, String phone) {
////		super();
////		this.id = id;
////		this.fullname = fullname;
////		this.item = item;
////		this.amount = amount;
////		this.phone = phone;
////	}
//
//	
//	
//	
//	
//	
//
