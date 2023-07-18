package pack4;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

class A
{
	String name;
	int age;
	
	A()
	{
		
	}
	A(String name, int age)
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
		return obj instanceof A && name == ((A)obj).name && age == ((A)obj).age;
	}
}

class sortByName implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		if(((A)o1).name == ((A)o2).name)
		{
			return ((A)o1).age - ((A)o2).age;
		}
		return ((A)o1).name.compareTo(((A)o2).name);
	}
}

class sortByAge implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		if(((A)o1).age == ((A)o2).age)
		{
			return ((A)o1).name.compareTo(((A)o2).name);
		}
		return ((A)o1).age - ((A)o2).age;
	}
}

public class M1 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(new A("sarang", 27), "Object1");
		map.put(new A("drithi", 24), "Object2");
		map.put(new A("sarang", 24), "Object3");
		map.put(new A("drithi", 27), "Object4");
		map.put(new A("charan", 25), "Object5");
		map.put(new A("sheetal", 25), "Object6");
		
		System.out.println("map : " + map);
		
//		sorting based on name
		TreeMap map1 = new TreeMap(new sortByName());
		map1.putAll(map);
		System.out.println("sortByName : " + map1);
		
//		sorting based on age
		TreeMap map2 = new TreeMap(new sortByAge());
		map2.putAll(map);
		System.out.println("sortByAge : " + map2);
	}
}
