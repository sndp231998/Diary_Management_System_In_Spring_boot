package com.diary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diary.entity.Purchase;



public interface PurchaseRepository  extends JpaRepository<Purchase, Long> {
 
}

