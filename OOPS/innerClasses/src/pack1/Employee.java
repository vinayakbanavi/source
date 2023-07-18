package pack1;

import java.util.ArrayList;
import java.util.List;

public class Employee
{	
	private String firstName;
	private String lastName;
	private List<Jobs> jobs = new ArrayList<>();
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public List<Jobs> getJobs()
	{
		return jobs;
	}
	
	public void setJobs(List<Jobs> jobs) 
	{
		this.jobs = jobs;
	}
	
	public String toString()
	{
		return firstName + ", " + lastName + ", " + jobs ;
	}
}
