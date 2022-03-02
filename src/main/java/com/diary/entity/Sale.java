package com.diary.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name="SALE")

public class Sale {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="full_name")
	@Size(min=6,max=15,message="name must be between 6 & 15 char ")
    @Pattern(regexp="^[a-zA-Z ]+$", message = "name must be a string")
	private String fullname;
	
	@Column(name="item")
	@Size(min=3,max=9,message="Enter Item !!! ")
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

	public float getQty() {
		return Qty;
	}

	public void setQty(float qty) {
		Qty = qty;
	}

	
	@Column(name="amount")
	private int amount;
	
	

	public Sale() {
	
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



	public Sale(Long id, String fullname, String item, int amount, String phone) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.item = item;
		this.amount = amount;
		
	}
	
//	public Sale() {
//		
//	}
	
	
	
	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getfullname() {
//		return fullname;
//	}
//	public void setfullname(String fullname) {
//		this.fullname = fullname;
//	}
//	public String getitem() {
//		return item;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getPhone() {
//		return phone;
//	}
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	public Baby(Long id, String firstName, String lastName, int age, String phone) {
//		super();
//		this.id = id;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
//		this.phone = phone;
//	}
	
	
}
