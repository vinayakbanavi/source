package pack3;

import java.util.HashSet;

class B
{
	int age;
	
	B(int age)
	{
		this.age = age;
	}
	
//	overriding toString() to return objects member instead of memory address
	
	public String toString()
	{
		return age + "";
	}
}
public class M2
{
	public static void main(String[] args) 
	{
		B b1 = new B(25);
		B b2 = new B(28);
		B b3 = new B(25);
		B b4 = new B(28);
		
		{
			HashSet set = new HashSet();
			set.add(25);
			set.add(28);
			set.add(25);
			set.add(28);
			
//			By default set won't allow duplicates		
			System.out.println("set [elements] : " + set);
		}
		
		{
			HashSet set = new HashSet();
			set.add(b1);
			set.add(b2);
			set.add(b3);
			set.add(b4);
			
//			when we add object to the list set cannot compare between the elements inside the object
//			even though two object elements containing same value it will get added to list
//			in order to compare between the members of the object override hashCode() and equals() in the entity Class
			
			System.out.println("set [Objects]  : " + set);
		}
	}
}
