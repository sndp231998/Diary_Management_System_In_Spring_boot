package com.diary.entity;

import javax.validation.constraints.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="PURCHASE")

public class Purchase {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//null level attribute;
	
	@Column(name="full_name")
	@Size(min=6,max=15,message="Fullname must be between 6 & 15 char ")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "name must be a string")
	private String fullname;
	

	@Column(name="item")
	@Size(min=4,max=9,message="Enter Item !!! ")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "name must be a string")
	private String item;
	

	@Column(name="qty")
	private float Qty;
	

	@Column(name="rate")
	private float rate;
	
	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	
	@Column(name="amount")
	private int amount;
	
	

	public float getQty() {
		return Qty;
	}

	public void setQty(float qty) {
		Qty = qty;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}



	

//	public Purchase(Long id, String fullname, String item, float qty, int amount, String phone) {
//		super();
//		this.id = id;
//		this.fullname = fullname;
//		this.item = item;
//		Qty = qty;
//		this.amount = amount;
//		this.phone = phone;
//	}
	
	

//	public Purchase(Long id, String fullname, String item, int amount, String phone) {
//		super();
//		this.id = id;
//		this.fullname = fullname;
//		this.item = item;
//		this.amount = amount;
//		this.phone = phone;
//	}

	
	
	
	
	
}
