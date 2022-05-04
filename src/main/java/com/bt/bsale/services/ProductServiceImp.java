package com.bt.bsale.services;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;
import static java.util.Collections.emptyList;

import java.util.ArrayList;

import com.bt.bsale.models.ProductModel;
import com.bt.bsale.repositories.ProductRepository;
import com.generation.demo.model.ProductoModel;

import java.util.Optional;


@Service
public class ProductServiceImp implements ProductService{
	
	private final ProductRepository productRepository;
    
    public ProductServiceImp (@Autowired ProductRepository productRepository) {
    	this.productRepository = productRepository;
    }


	@Override
	public ArrayList<ProductModel> obtenerDatosProductos() {
		return (ArrayList<ProductModel>) productRepository.findAll();
	}
	
	
    
}
