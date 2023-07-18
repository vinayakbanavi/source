package pack4;

import java.util.ArrayList;
import java.util.Collections;

class C implements Comparable
{
	String name;
	
	C(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}
	
	public int compareTo(Object obj)
	{
//		String class containing compareTo method we can directly use it
		return name.compareTo(((C)obj).name);
	}
}
public class M3
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new C("doer"));
		list.add(new C("getter"));
		list.add(new C("setter"));
		list.add(new C("better"));
		
		System.out.println("list        : "+ list);
		Collections.sort(list);
		System.out.println("sorted list : " + list);
	}
}
