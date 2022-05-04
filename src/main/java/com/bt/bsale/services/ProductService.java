package com.bt.bsale.services;
import static java.util.Collections.emptyList;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bt.bsale.models.ProductModel;



public interface ProductService {
	
	ArrayList<ProductModel> obtenerDatosProductos();
		
	
}
