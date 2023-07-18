/**
 		Comparator interface :
 		is available in java.util package
 		is implemented to compare between two objects
 */

package pack5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class A
{
	int age;
	char gender;
	
	A(int age, char gender)
	{
		this.age = age;
		this.gender = gender;
	}
	
	public String toString()
	{
		return "(" + age + ", " + gender + ")";
	}
}

class comp1 implements Comparator
{
	static int step;
//	implementing compare for sorting based on age
	public int compare(Object o1, Object o2)
	{
//		System.out.println("step : " + ++step + " --> obj1 - " + ((A)o1).age + ", obj2 - " + ((A)o2).age);
		return ((A)o1).age - ((A)o2).age;
	}
}

class comp2 implements Comparator
{
//	implementing compare for sorting based on gender
	public int compare(Object o1, Object o2)
	{
		return Character.valueOf(((A)o1).gender).compareTo(((A)o2).gender);
	}
}

public class M1 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new A(25, 'M'));
		list.add(new A(32, 'F'));
		list.add(new A(21, 'F'));
		list.add(new A(35, 'M'));
		list.add(new A(29, 'F'));
		list.add(new A(18, 'M'));
		
		System.out.println("list           : " + list);
		
		
//		while sorting with Comparator, must supply comparator object along with the list as argument
		Collections.sort(list, new comp1());
		System.out.println("sort comp1(age): " + list);
		
		Collections.sort(list, new comp2());
		System.out.println("sort comp2(gen): " + list);
	}
}
