//package com.diary.service.impl;
//
//
//import java.util.List;
//
//import org.springframework.stereotype.Service;
//
//import com.diary.entity.Product;
//import com.diary.repository.ProductRepository;
//import com.diary.service.ProductService;
//
//
//
//@Service
//public class ProductServiceImpl implements ProductService {
//
//	private ProductRepository productRepository;
//	
//	public ProductServiceImpl(ProductRepository productRepository) {
//		super();
//		this.productRepository = productRepository;
//	}
//
//	@Override
//	public List<Product> getAllProducts() {
//		
//		return productRepository.findAll();
//	}
//
//	@Override
//	public Product saveProduct(Product product) {
//		
//		return productRepository.save(product);
//	}
//
//	@Override
//	public Product getProductById(Long id) {
//		
//		return productRepository.findById(id).get();
//	}
////
//	@Override
//	public Product updateProduct(Product product) {
//		
//		return productRepository.save(product);
//	}
//
//	@Override
//	public void deleteProductById(Long id) {
//		
//		
//		productRepository.deleteById(id);
//	}
//
//
//}
