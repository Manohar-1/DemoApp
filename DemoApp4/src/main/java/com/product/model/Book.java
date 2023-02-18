package com.product.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="books")
@DiscriminatorValue("1")
public class Book extends Product{
	private String author;

}
