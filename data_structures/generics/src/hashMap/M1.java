package hashMap;

import java.util.HashMap;

public class M1
{
	public static void main(String[] args) 
	{
//		with generic
		{
			HashMap<String, String> map1 = new HashMap();
			map1.put("P1", "Martin");
			map1.put("P2", "Kranti");
			map1.put("P3", "Vedha");
			map1.put("P4", "Robert");
			
			System.out.println("map1 : " + map1);
	
// 			We can only add elements if their respective DataTypes are same
//			in map 1 key --> String , Value --> String.
//			if any one type is mismatched we can't add it to map 
			
//			map1.put(100, "Ansh");
//			map1.put("p4", 150);
//			map1.put(10, 20);
			
//			TypeCasting is not required
			String s1 = map1.get("P1");
			String s2 = map1.get("P4");
			
			HashMap<String, Integer> map2 = new HashMap();
			map2.put("Shaasthi", 25);
			map2.put("Theeran", 28);
			map2.put("Vikram", 27);
			map2.put("Adityan", 30);
			
			System.out.println("map2 : " + map2);
			
//			map2.put(25, "Shreeman");
			
//			TypeCasting is Not required
			int i1 = map2.get("Theeran");
			int i2 = map2.get("Adityan");	
		}
		
//		without generic
		{
//			HashMap <Object, Object> map = new HashMAp();
			HashMap map = new HashMap();
			map.put(1, "Shreeman");
			map.put(true, 25);
			map.put(1.05, true);
			map.put(false, null);
			map.put(null, 'A');
			
			System.out.println("\nNon Generic map : " + map);
			
//			in non generic map key and value can be of any DataType
			
//			TypeCasting is necessary
//			String s1 = map.get(1);
			String s1 = (String) map.get(1);
			boolean b1 = (boolean) map.get(1.05);
			
		}
	}
}
