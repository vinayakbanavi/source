package pack4;

import java.util.HashSet;
import java.util.TreeSet;

class A
{
	int i;
	
	A(int i)
	{
		this.i = i;
	}
	
	public String toString()
	{
		return i + "";
	}
}

public class M1 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(new A(25));
		set.add(new A(28));
		set.add(new A(17));
		set.add(new A(19));
		
		System.out.println("set : " + set);
		
		TreeSet set1 = new TreeSet();
		set1.addAll(set);
//		Sorting can't be done directly in case of custom entity class Objects
//		if done we will get ClassCastException
		
//		for sorting sort process will internally use compareTo()
//		All the wrapper class implements compareTo() so that byte, short, int , long , float, double, char, boolean can be compared
//		in order to sort our Custom class members we must Implement Comparable/Comparator 
	}
}
