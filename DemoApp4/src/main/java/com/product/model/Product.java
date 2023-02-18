package com.product.model;

import javax.persistence.GeneratedValue;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="products")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="product_type",discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue("45")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private long productId;
    private String name;
    
    public Product(long productId, String name) {
		super();
		this.productId = productId;
		this.name = name;
	}
    
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + "]";
	}
	public Product() {
		super();
	}
	
    
    
}
