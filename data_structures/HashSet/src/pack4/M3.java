package pack4;

import java.util.HashSet;
import java.util.TreeSet;

class C implements Comparable
{
	double salary;
	
	C(double salary)
	{
		this.salary =salary;
	}
	
	public String toString()
	{
		return salary + "";
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof C && salary == ((C)obj).salary;
	}
	 
	public int hashCode()
	{
		return Double.toString(salary).hashCode();
	}
	
	public int compareTo(Object obj)
	{
		return Double.valueOf(salary).compareTo(((C)obj).salary);
	}
	
}
public class M3 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(new C(25620.5));
		set.add(new C(25602.5));
		set.add(new C(28590.7));
		set.add(new C(18000.5));
		
		System.out.println("set : " + set);
		
		TreeSet set1 = new TreeSet(set);
		System.out.println("sortd set1 : " + set1);
	}
}
