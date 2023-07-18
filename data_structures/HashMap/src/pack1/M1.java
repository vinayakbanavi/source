 package pack1;

import java.util.HashMap;

public class M1 
{
	public static void main(String[] args) 
	{
//		creating map and adding elements
		{
//			creating an object in HashMap class 
			HashMap map = new HashMap();
			
//			put(key, value) is used to add elements into map
			
			map.put(1, 1);
			map.put("String", 2.5);
			map.put('A', false);
			map.put(true, null);
			map.put(null, null);
			
			System.out.println("map : " + map);
		}
		
//		duplicate values 
		System.out.println("\nAdding duplicate values for the different keys");
		{
			HashMap map = new HashMap();
			map.put("key1", 100);
			map.put("key2", 100);
			map.put("key3", 100);
			map.put("key4", 100);
			map.put("key5", 100);
			
			System.out.println("map : " + map);
			
			System.out.println("map.put(unique key) returns    : " + map.put("key6", 100));
		}
		
//		duplicate keys
		System.out.println("\nAdding duplicate keys");
		{
			HashMap map = new HashMap();
			map.put("key1", 100);
			map.put("key1", 200);
			map.put("key1", 300);
			map.put("key1", 400);
			map.put("key1", 500);
			
			System.out.println("map : " + map);			
			System.out.println("map.put(duplicate key) returns : " + map.put("key1", 600) );
			System.out.println("map : " + map);
		}
		
//		map.putAll(map1)
		System.out.println("\nAdding elements of one map to another");
		{
			HashMap map = new HashMap();
			map.put("AKshay", 32000);
			map.put("Ramanath", 39000);
			map.put("Lakshmi", 29000);
			map.put("Sudha", 31000);
			map.put("Nakul", 27000);
			System.out.println("map  : " + map);
			
			HashMap map1 = new HashMap();
			map1.put("Ramanath", 50000);
			map1.put("Bindu", 26000);
			map1.put("Jagan", 31000);
			map1.put("Kishor", 36000);
			map1.put("Nakul", 35000);
			System.out.println("map1 : " + map1);
			
			System.out.println("\nAdding elements of map1 to map by map.putAll(map1)");
			map.putAll(map1);
			
			System.out.println("map : " + map);
//			if map1 contains some same elements those will get update rest will add to map
			
//			System.out.println(map.containsKey(map1));
		}
	}
}
/*
	HashMap:
		 --> it is a part of Collection but does not implements Collection
		 --> it is a mapping between key and values
		 --> Does not preserve order of addition
		 
		 --> Since we are not providing any DataType through generic
		 --> default data time will be taken as Object type
		 
		 --> key and value can be of any Data type.
		 
		 --> while providing same elements for all keys.
		     Every time it will get updated with specified element as a value.
		     
		 --> put(k, V) returns Previous Value That key holds, 
		  	 if we are putting key for the first time it returns null.
		  	 
		 --> put(existing key, new value) acts as a update/set
		 
*/