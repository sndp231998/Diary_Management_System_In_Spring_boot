//package com.diary.validation;
//
//import org.springframework.validation.Errors;
//import org.springframework.validation.ValidationUtils;
//import org.springframework.validation.Validator;
//
//import com.diary.entity.Purchase;
//
//public class DiaryValidator implements Validator{
//
//	@Override
//	public boolean supports(Class<?> clazz) {
//		// TODO Auto-generated method stub
//		return Purchase.class.equals(clazz);
//	}
//
//	@Override
//	public void validate(Object obj, Errors errors) {
//		ValidationUtils.rejectIfEmpty(errors, "fullname", "fullname.empty");
//		
//		Purchase p =(Purchase) obj;
//		if(p.getQty()<0) {
//			errors.rejectValue("qty", "negativevalue");
//		}else if(p.getQty()>100) {
//			errors.rejectValue("qty", "qty80");
//		}
//	}
//
//}
