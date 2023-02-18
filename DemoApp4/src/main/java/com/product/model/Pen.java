package com.product.model;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="pens")
@DiscriminatorValue("2")
public class Pen extends Product {
     
	private String color;

}
