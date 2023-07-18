package pack3;

import java.util.HashSet;

class Person
{
	String firstName;
	String lastName;
	
	Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName  = lastName;
	}
	
	public String toString()
	{
		return "("+ firstName +", "+ lastName +")";
	}
	
	public int hashCode()
	{
		return firstName.hashCode() + lastName.hashCode();
	}
	
	public boolean equals(Object o1)
	{
		return o1 instanceof Person &&
			   firstName == ((Person)o1).firstName &&
			   lastName == ((Person)o1).lastName;
	}
}

public class M5 
{
	public static void main(String[] args) 
	{
		HashSet<Person> set = new HashSet();
		set.add(new Person("Nag", "Ashwin"));
		set.add(new Person("Ashwin", "Nag"));
		set.add(new Person("chetan", "kumar"));
		set.add(new Person("kumar", "chetan"));
		
		System.out.println("set : " + set);
	}
}
