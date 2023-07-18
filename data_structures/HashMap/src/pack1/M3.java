package pack1;

import java.util.HashMap;

public class M3 
{
	public static void main(String[] args) 
	{
		
//		map.containsKey(element) And map.containsValue(element)
		{
			
			HashMap map = new HashMap();
			map.put("Nripatunga", 32000);
			map.put("Pulakeshi", 39000);
			map.put("Madakari", 29000);
			map.put("Krishnadevaraya", 31000);
			map.put("prithviraj", 27000);
			System.out.println("map : " + map);
			
			System.out.println("\nSearching for the specific key or element in the map");
			System.out.println("map.containsKey(Madakari) : " + map.containsKey("Madakari"));
			System.out.println("map.containsKey(Madakari) : " + map.containsKey("tippu"));
			
			System.out.println("\nmap.containsValue(27000)  : " + map.containsValue(27000));
			System.out.println("nmap.containsValue(15000) : " + map.containsValue(15000));
		}
	}
}

/*
	containsAll(another map) is not available 
*/