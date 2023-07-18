package pack3;

import java.util.HashSet;

class C
{
//	when class containing single attribute.
	int age;
	
	C(int age)
	{
		this.age = age;
	}
	
//	overriding toString() to return objects member instead of memory address
	
	public String toString()
	{
		return age + "";
	}
	
//	overriding equals() and hashCode() for comparing between member of the objects
	public int hashCode()
	{
		return Integer.toString(age).hashCode();
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof C && age == ((C)obj).age;
	}
}

public class M3 
{
	public static void main(String[] args) 
	{
		C c1 = new C(25);
		C c2 = new C(25);
		C c3 = new C(35);
		C c4 = new C(35);
		
//		adding elements to the set
//		hashCode() and equals() are overridden in wrapper classes so that set able to compare between the data of the object
		{
			HashSet set = new HashSet();
			set.add(25);
			set.add(25);
			set.add(35);
			set.add(35);
			
			System.out.println("set [elements] : " + set);
		}
		
//		adding object to the set
		{
			HashSet set = new HashSet();
			set.add(c1);
			set.add(c2);
			set.add(c3);
			set.add(c4);
			
			System.out.println("set [Objects]  : " + set);
		}
	}
}
