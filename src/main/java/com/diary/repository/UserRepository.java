package com.diary.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.diary.entity.User;




public interface UserRepository extends JpaRepository<User, Long>{
	User findByEmail(String email);
}
