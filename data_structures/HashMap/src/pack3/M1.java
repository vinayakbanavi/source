package pack3;

import java.util.HashMap;
import java.util.TreeMap;

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
	
	public int hashCode()
	{
		return Integer.toString(i).hashCode();
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof A && i == ((A)obj).i;
	}
}

public class M1 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(new A(25), "Object1");
		map.put(new A(10), "Object2");
		map.put(new A(75), "Object3");
		map.put(new A(55), "Object4");
		map.put(new A(35), "Object5");
		
		System.out.println("map : " + map);
		
//		in order to sort elements in the map must implement Comparable
		
		TreeMap map1 = new TreeMap(map);
		System.out.println("map1 : " + map1);
 	}
}
