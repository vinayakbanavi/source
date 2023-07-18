package pack5;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

class A
{
	String name;
	int age;
	
	A(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "(" + name + ", " + age + ")";
	}
	
	public int hashCode()
	{
		return name.hashCode() + Integer.toString(age).hashCode(); 
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof A &&  name == ((A)obj).name && age == ((A)obj).age;
	}	
}

class Compare1 implements Comparator
{
//	sorting based on name
	
	public int compare(Object o1, Object o2)
	{
		return ((A)o1).name.compareTo(((A)o2).name);
	}
}

class Compare2 implements Comparator
{
//	sorting based on age
	
	public int compare(Object o1, Object o2)
	{
		if (((A)o1).age == ((A)o2).age)
		{
			return ((A)o1).name.compareTo(((A)o2).name);
		}
		return ((A)o1).age - ((A)o2).age;
	}
}

public class M1 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(new A("prajna", 28));
		set.add(new A("pratham", 25));
		set.add(new A("pradhyumna", 28));
		set.add(new A("prerana", 25));
		set.add(new A("lokesh", 28));
		set.add(new A("dhruva", 25));
		
		System.out.println("set : " + set);
		
		TreeSet set1 = new TreeSet(new Compare1());
		set1.addAll(set);
		System.out.println("sort based on name : " + set1);
		
		TreeSet set2 = new TreeSet(new Compare2());
		set2.addAll(set);
		System.out.println("sort based on age  : " + set2);
//		System.out.println(set2);
	}
}

/*
 		The following implementation of the Comparator has drawback/bug.
 		which omits the similar elements i,e if tow elements having same values it will consider only one in the sort
	
		class Compare1 implements Comparator
		{
		//	sorting based on name
			
			public int compare(Object o1, Object o2)
			{
				return ((A)o1).name.compareTo(((A)o2).name);
			}
		}
		
		class Compare2 implements Comparator
		{
		//	sorting based on age
			
			public int compare(Object o1, Object o2)
			{
				return ((A)o1).age - ((A)o2).age;
			}
		}
		
		
		Output :
		
		set : [(lokesh, 28), (pradhyumna, 28), (prajna, 28), (dhruva, 25), (pratham, 25), (prerana, 25)]
		sort based on name : [(dhruva, 25), (lokesh, 28), (pradhyumna, 28), (prajna, 28), (pratham, 25), (prerana, 25)]
		sort based on age  : [(dhruva, 25), (lokesh, 28)]
		
		
		As we can see while sorting based on the age it ommitted remaining records even though they are unique
 */