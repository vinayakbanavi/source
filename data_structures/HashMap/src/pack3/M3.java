package pack3;

import java.util.HashMap;
import java.util.TreeMap;

// Multiple attribute class
class D implements Comparable
{
	String name;
	int age;
	
	D()
	{
		
	}
	D(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return "(" + name + ", " + age + ")";
	}
	
	public int hashCode()
	{
		return name.hashCode() + Integer.toString(age).hashCode();
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof D && name == ((D)obj).name && age == ((D)obj).age;
	}
	
	public int compareTo(Object obj)
	{
//		return name.compareTo(((D)obj).name);
//		return age - ((D)obj).age;
		
		if (age == ((D)obj).age)
		{
			return name.compareTo(((D)obj).name);
		}
		return age - ((D)obj).age;
	}
}

public class M3 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(new D("Akash", 18), "Object1");
		map.put(new D("Chetan", 25), "Object2");
		map.put(new D("Charan", 26), "Object3");
		map.put(new D("Faiz", 25), "Object4");
		map.put(new D("Shravan", 25), "Object5");
		
		System.out.println("map  : " + map);
		
		TreeMap map1 = new TreeMap(map);
		System.out.println("map1 : " + map1);
	}
}
