package pack5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person
{
	String name;
	int age;
	
	Person(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "(" + name + "," + age + ")";
	}
}

class compareByName implements Comparator<Person>
{
	public int compare(Person o1, Person o2) 
	{
		return o1.name.compareTo(o2.name);
	}
}

class compareByAge implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		return ((Person)o1).age - ((Person)o2).age;
	}
}
public class M3
{
	public static void main(String[] args)
	{
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("Vinayak", 26));
		list.add(new Person("Vinayak", 26));
		list.add(new Person("Akshay", 21));
		list.add(new Person("Sindhuri", 32));
		list.add(new Person("Manvitha", 25));
		list.add(new Person("Kriti", 22));
		
		System.out.println("list : " + list);
		
//		sort based on name
		Collections.sort(list, new compareByName());
		System.out.println("compareByName : " + list);
		
//		sort based on age
		Collections.sort(list, new compareByAge());
		System.out.println("compareByAge  : " + list);
	}
}
