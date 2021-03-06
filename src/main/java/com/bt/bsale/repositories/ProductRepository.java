package com.bt.bsale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bt.bsale.models.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer>{

}
