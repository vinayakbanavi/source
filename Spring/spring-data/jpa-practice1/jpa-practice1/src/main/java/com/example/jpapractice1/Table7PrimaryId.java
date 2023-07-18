package com.example.jpapractice1;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

// Every IdClass must implement Serializalbe 

@Embeddable
public class Table7PrimaryId implements Serializable
{
	private String patientId;
	private String patientName;
}
