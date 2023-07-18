package com.example.jpadev;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class ProductPK implements Serializable 
{
	private String title;
	private String author;
}
