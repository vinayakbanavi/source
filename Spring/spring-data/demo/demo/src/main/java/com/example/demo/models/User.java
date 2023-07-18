package com.example.demo.models;

public class User 
{
	String username;
	String password;
	
	private ContactInfo info;

	public String getUsername()
	{
		return username;
	}

	public void setUserName(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password) 
	{
		this.password = password;
	}

	public ContactInfo getInfo() 
	{
		return info;
	}

	public void setInfo(ContactInfo info) 
	{
		this.info = info;
	}

}
