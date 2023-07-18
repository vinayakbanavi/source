package pack4;

import java.util.ArrayList;
import java.util.Collections;

class B implements Comparable
{
	int i;
	
	B(int i)
	{
		this.i = i;
	}
	
	public String toString()
	{
		return i + "";
	}
	
	// Comparable available in java.lang
	
	static int step;
	public int compareTo(Object obj)
	{
//		System.out.println("step : " + ++step  + " compareTo --> this : " + this + ", obj :" + ((B)obj).i + " result :" + (i - ((B)obj).i) +"\n");
		return i - ((B)obj).i;
		
//		for reverse order
//		return ((B)obj).i - i;
	}
	
}
public class M2 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new B(10));
		list.add(new B(280));
		list.add(new B(48));
		list.add(new B(36));
		list.add(new B(21));
		list.add(new B(19));
		
		System.out.println("list        --> " + list);
	
//		in order to sort the object based on members we must implement Comparable or Comparator 
		Collections.sort(list);
		
		System.out.println("sorted list --> " + list);
		
		
	}
}
