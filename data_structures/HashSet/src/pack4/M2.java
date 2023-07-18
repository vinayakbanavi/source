package pack4;

import java.util.HashSet;
import java.util.TreeSet;

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
	
	public boolean equals(Object obj)
	{
		return obj instanceof B && i == ((B)obj).i;
	}
	
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	
	public int compareTo(Object obj)
	{
		return i - ((B)obj).i;
	}
	
}

public class M2 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(new B(25));
		set.add(new B(18));
		set.add(new B(17));
		set.add(new B(26));
		set.add(new B(32));
		
		System.out.println("set        : " + set);
		
//		Sorting the set using TreeSet and implementing CompareTo method of Comparable
		
		TreeSet set1 = new TreeSet(set);
		System.out.println("Sorted set1 : " + set1);
		
	}
}
