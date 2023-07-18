package com.example.practice2;

import java.util.ArrayList;

public class Academics 
{
	private String education;
	private ArrayList<String> skills = new ArrayList();
	private double aggregate;
	
	public String getEducation() 
	{
		return education;
	}
	
	public void setEducation(String education) 
	{
		this.education = education;
	}
	
	public ArrayList<String> getSkills() 
	{
		return skills;
	}
	
	public void setSkills(String skill)
	{
		skills.add(skill);
	}
	
	public double getAggregate() 
	{
		return aggregate;
	}
	
	public void setAggregate(double aggregate) 
	{
		this.aggregate = aggregate;
	}
}
