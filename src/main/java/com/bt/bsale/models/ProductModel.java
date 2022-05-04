package com.bt.bsale.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity   
@Table(name = "product")  
public class ProductModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false )
	private Integer id;
	
	@Column(name = "name", nullable = false,length = 256) 
	private String name;
	
	@Column(name = "url_image", nullable = false,length = 256)
	private String url_image;
	
	@Column(name = "price" , unique = true, nullable = false )
	private float price;
	
	@Column(name = "discount" ,unique = true, nullable = false )
	private Integer discount;
	
	public ProductModel() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl_image() {
		return url_image;
	}

	public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", name=" + name + ", url_image=" + url_image + ", price=" + price
				+ ", discount=" + discount + "]";
	}
	




	
}
