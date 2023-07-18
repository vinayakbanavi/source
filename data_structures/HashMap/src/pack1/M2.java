package pack1;

import java.util.HashMap;

public class M2 
{
	public static void main(String[] args) 
	{
//		get(key) 
		{
			HashMap map = new HashMap();
			map.put("Akshay", 32000);
			map.put("Ramanath", 39000);
			map.put("Lakshmi", 29000);
			map.put("Sudha", 31000);
			map.put("Nakul", 27000);
			
	
			System.out.println("map : " + map);
			
			Object obj = map.get("Akshay");
			int i = (int) map.get("Lakshmi");
			
			System.out.println(obj);
			
			System.out.println(map.get("Ramanath"));
			
//			get(unAvailable key) will not throw Exception instead return null
			
			System.out.println("get(unAvialable key) : " + map.get("noKey"));
		}
	}
}

/*
 		get(key) is available in HashMap
 		it will return the value associated with the key

*/