package com.example.practice2;

public class Address 
{
	private String houseNo;
	private String street;
	private String area;
	private String city;
	private static String state = "Karnataka";
	private static String country = "India";
	
	public String getHouseNo() 
	{
		return houseNo;
	}
	
	public void setHouseNo(String houseNo) 
	{
		this.houseNo = houseNo;
	}
	
	public String getStreet() 
	{
		return street;
	}
	
	public void setStreet(String street) 
	{
		this.street = street;
	}
	
	public String getArea() 
	{
		return area;
	}
	
	public void setArea(String area) 
	{
		this.area = area;
	}
	
	public String getCity() 
	{
		return city;
	}
	
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public static String getState() 
	{
		return state;
	}

	public static String getCountry() 
	{
		return country;
	}

}

/*
 		Json Body
 		{
 			"houseNo" : "123/A",
 			"street" : "2nd Street",
 			"area" : "BTM",
 			"city" : "Bengaluru"
 			
 		}
 		
 */






























