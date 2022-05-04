package com.bt.bsale.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bt.bsale.models.ProductModel;
import com.bt.bsale.services.ProductService;


@RestController  
public class ProductController {
	private final ProductService productService;
	
	//constructor
	public ProductController (@Autowired ProductService productService) {
		this.productService = productService;
		
	}
	
	
	
	@GetMapping("/productos")
public List<ProductModel> obtenerProductos(){
	return productService.obtenerProductos();
	
	
}
	
	
	
	
}
