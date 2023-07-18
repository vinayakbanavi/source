/**
 * User is a java bean class
 * Used for testing Dependency injection
 */

package com.test.constructorDI;

public class User 
{
	private String userId;
	private String userName;

	User(String userId, String userName)
	{
		System.out.println("User Object Created");
		this.userId = userId;
		this.userName = userName;
	}

	public String getUserId() 
	{
		return userId;
	}

	public String getUserName() 
	{
		return userName;
	}
	
	
}

