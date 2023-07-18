package pack2_objects;

public class Person 
{
	private String firstName;
	private String lastName;
	private int age;
	private String sex;
	
	public Person(String firstName, String lastName) 
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public void setSex(String sex) 
	{
		this.sex = sex;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}

	public int getAge() 
	{
		return age;
	}

	public String getSex() 
	{
		return sex;
	}
	
	
	
}
