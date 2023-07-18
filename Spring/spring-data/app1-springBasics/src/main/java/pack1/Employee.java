package pack1;

public class Employee 
{
	private String firstName;
	private String lastName;
	
//	Data injection through Constructor
	public Employee(String firstName, String lastName)
	{
		System.out.println("Constructor from Employee");
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
}
