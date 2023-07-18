package com.example.jpadev;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
// second approach to make composite primary
@Entity
public class Product 
{
	@EmbeddedId
	private ProductPK productPk;
	private String price;
	private String specs;
}
