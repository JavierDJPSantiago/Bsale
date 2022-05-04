package com.bt.bsale.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bt.bsale.models.CategoryModel;
import com.bt.bsale.repositories.CategoryRepository;
import com.generation.demo.model.ProductoModel;
import com.generation.demo.repository.ProductoRepository;

@Service
public class CategoyServiceImp implements CategoryService {
	
	private final CategoryRepository categoryRepository;
	
	public CategoyServiceImp (@Autowired CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	@Override
	public ArrayList<CategoryModel> obtenerProductosCategoria() {
		return (ArrayList<CategoryModel>) categoryRepository.findAll();
	}

}
