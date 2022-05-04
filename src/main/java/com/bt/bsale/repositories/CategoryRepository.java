package com.bt.bsale.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bt.bsale.models.CategoryModel;


@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Integer>{

}
