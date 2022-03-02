package com.diary.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.diary.dto.UserRegistrationDto;
import com.diary.entity.User;



public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
