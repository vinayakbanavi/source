package pack3;

import java.util.HashMap;
import java.util.TreeMap;

class B implements Comparable
{
	int i;
	
	B()
	{
		
	}
	
	B(int i)
	{
		this.i = i;
	}
	
	public String toString()
	{
		return i + "";
	}
	
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof B && i == ((B)obj).i;
	}
	
	public int compareTo(Object obj)
	{
		return i - ((B)obj).i;
	}
}

class C implements Comparable
{
	String name;
	
	C()
	{
		
	}
	
	C(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return name;
	}
	
	public int hashCode()
	{
		return name.hashCode();
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof C && name == ((C)obj).name;
	}
	
	public int compareTo(Object obj)
	{
		return name.compareTo(((C)obj).name);
	}
}
public class M2 
{
	public static void main(String[] args) 
	{
		System.out.println("Adding Objects of custom class B");
		{
			HashMap map = new HashMap();
			map.put(new B(25), "Object1");
			map.put(new B(10), "Object2");
			map.put(new B(75), "Object3");
			map.put(new B(55), "Object4");
			map.put(new B(35), "Object5");
			
			System.out.println("map : " + map);
			
			TreeMap map1 = new TreeMap(map);
			System.out.println("map1 : " + map1);
		}
		
		System.out.println("\nAdding Objects of custom class C");
		{
			
			HashMap map = new HashMap();
			map.put(new C("krithi"), "object1");
			map.put(new C("indu"), "object2");
			map.put(new C("kishan"), "object3");
			map.put(new C("harsha"), "object4");
			map.put(new C("ramesh"), "object5");
			System.out.println("map : " + map);
			
			TreeMap map1 = new TreeMap(map);
			System.out.println("map1 : " + map1);
		}
	}
}
