package pack1;

import java.util.HashMap;

public class M4 
{
	public static void main(String[] args) 
	{
//		remove(key) --> returns Value
		System.out.println("removing element from map using remove(k)\n");
		{
			HashMap map = new HashMap();
			map.put("Akshay", 32000);
			map.put("Ramanath", 39000);
			map.put("Lakshmi", 29000);
			map.put("Sudha", 31000);
			map.put("Nakul", 27000);
			
			System.out.println("map : " + map);
			System.out.println("map.remove(Akshay) returns : " + map.remove("Akshay"));
//			if key is not present returns null 
			System.out.println("map.remove(Modi) returns : " + map.remove("Modi"));
			System.out.println("map : " + map);
			
			
		}
		
//		remove(key, Value) --> returns boolean
		System.out.println("\nremoving element from map using remove(k, v)");
		{
			HashMap map = new HashMap();
			map.put("Akshay", 32000);
			map.put("Ramanath", 39000);
			map.put("Lakshmi", 29000);
			map.put("Sudha", 31000);
			map.put("Nakul", 27000);
			
			System.out.println("\nmap : " + map);
			System.out.println("remove map.remove(Akshay, 32000) returns : " + map.remove("Akshay", 32000));
			System.out.println("remove map.remove(Nakul, 28000) returns : " + map.remove("Nakul", 28000));
			System.out.println("map : " + map);
			
//			in the case of remove(k, v) the element will remove only if both key and value match
		}
		
//		map.clear();
		System.out.println("\nRemoving all the elements from the map using map.clear()");
		{
			HashMap map = new HashMap();
			map.put("Akshay", 32000);
			map.put("Ramanath", 39000);
			map.put("Lakshmi", 29000);
			map.put("Sudha", 31000);
			map.put("Nakul", 27000);
				
			System.out.println("map : " + map);
			map.clear();
			System.out.println("map isEmpty() : " + map.isEmpty());
			System.out.println("map : " + map);
		}
	}
}
