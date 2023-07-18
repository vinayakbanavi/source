package pack1;

import java.util.HashMap;
import java.util.TreeMap;

public class M6 
{
	public static void main(String[] args) 
	{
//		sorting of map using TreeMap
		{
			HashMap map = new HashMap();
			map.put("Akshay", 32000);
			map.put("Ramanath", 39000);
			map.put("Lakshmi", 29000);
			map.put("Sudha", 31000);
			map.put("Nakul", 27000);
			map.put("Ramachandra", 26000);
			map.put("Jitendra", 19000);
			map.put("Namrata", 25000);
			map.put("Sujay", 16000);
			System.out.println("map         : " + map);
			
			TreeMap map1 = new TreeMap(map);
			System.out.println("sorted map1 : " + map1);
//			by default sorting is based on key
		}
	}
}
