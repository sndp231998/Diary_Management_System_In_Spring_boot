package com.diary.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.diary.entity.Sale;




public interface SaleRepository extends JpaRepository<Sale, Long> {

}
