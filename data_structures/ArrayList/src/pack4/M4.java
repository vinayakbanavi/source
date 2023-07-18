package pack4;

import java.util.Collections;

import java.util.ArrayList;

class D implements Comparable
{
	boolean isMarried;
	
	D(boolean isMarried)
	{
		this.isMarried = isMarried;
	}
	
	public String toString()
	{
		return isMarried + "";
	}
	
	public int compareTo(Object obj)
	{
//		valueOf will create the wrapper Object 
//		compareTo is implemented in wrapper classes so we can directly use.
		return Boolean.valueOf(isMarried).compareTo(((D)obj).isMarried);
	}
}
public class M4 
{
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(new D(false));
		list.add(new D(true));
		list.add(new D(true));
		list.add(new D(false));
		list.add(new D(true));
		
		System.out.println("list   : " + list);
		Collections.sort(list);
		System.out.println("sorted : " + list);
		
	}
}
