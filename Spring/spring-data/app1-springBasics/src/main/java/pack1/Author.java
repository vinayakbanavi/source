package pack1;

public class Author 
{
	private String firstName;
	private String lastName;
	private Address address;
	
	public Author(String firstName, String lastName, Address address) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public Address getAddress() 
	{
		return address;
	}
	
	
}
