package com.bt.bsale.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bt.bsale.models.CategoryModel;
import com.bt.bsale.services.CategoryService;
import com.generation.demo.model.ProductoModel;
import com.generation.demo.service.ProductoService;


@RestController
public class CategoryController {
	
	private final CategoryService categoryService;
	
	public CategoryController(@Autowired CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping("/categoria")
	public ArrayList<CategoryModel> obtenerDatosProductos(){
		return categoryService.obtenerProductosCategoria();
	}
	
	
}
