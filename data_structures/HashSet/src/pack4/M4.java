package pack4;

import java.util.HashSet;
import java.util.TreeSet;

class D implements Comparable
{
	String name;
	char gender;
	
	D(String name, char gender)
	{
		this.name = name;
		this.gender = gender;
	}
	
	public String toString()
	{
		return "(" + name + ", " + gender + ")";
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof D &&  name == ((D)obj).name && gender == ((D)obj).gender;
	}
	
	public int hashCode()
	{
		return name.hashCode() + Character.valueOf(gender).hashCode(); 
	}
	
	public int compareTo(Object obj)
	{
//		comparaTo will deals with only one attribute for one time
//		not convenient for multiple attribute sorting at same time
		return name.compareTo(((D)obj).name);
//		return Character.valueOf(gender).compareTo(((D)obj).gender);
	}
	
}

public class M4 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(new D("vinay", 'M'));
		set.add(new D("vinay", 'M'));
		set.add(new D("vinay", 'M'));
		set.add(new D("vinay", 'M'));
		set.add(new D("nayana", 'F'));
		set.add(new D("prema", 'F'));
		set.add(new D("aditya", 'M'));
		set.add(new D("vikram", 'M'));
		
		System.out.println("set : " + set);
		
//		Sorting the set is not possible directly with TreeSet because of different objects
		
		TreeSet set1 = new TreeSet(set);
		System.out.println("set1 : " + set1 );
	}
}
