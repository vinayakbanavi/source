package pack5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class B
{
	String name;
	char gender;
	
	B(String name, char gender)
	{
		this.name = name;
		this.gender = gender;
	}
	
	public String toString()
	{
		return "(" + name + ", " + gender + ")";
	}
}

class C1 implements Comparator
{
//	implementing compare for sorting based on age
	public int compare(Object o1, Object o2)
	{
		return ((B)o1).name.compareTo(((B)o2).name);
	}
}

class C2 implements Comparator
{
//	implementing compare for sorting based on gender
	public int compare(Object o1, Object o2)
	{
		return Character.valueOf(((B)o1).gender).compareTo(((B)o2).gender);
	}
}

public class M2 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new B("abhinav", 'M'));
		list.add(new B("nayana", 'F'));
		list.add(new B("chaya", 'F'));
		list.add(new B("gobind", 'M'));
		list.add(new B("dheya", 'F'));
		list.add(new B("hemanth", 'M'));
		
		System.out.println("list               : " + list);
		
		Collections.sort(list, new C1());
		System.out.println("sort comp1(name)   : " + list);
		
		Collections.sort(list, new C2());
		System.out.println("sort comp2(gender) : " + list);
	}
}
