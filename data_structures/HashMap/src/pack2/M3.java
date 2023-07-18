package pack2;

import java.util.HashMap;

class C
{
	int id;
	
	C(int id)
	{
		this.id = id;
	}
	
//	Overriding toString() to get member of the object instead of memory Address
	public String toString()
	{
		return id + "";
	}
	
//	Overriding hashCode() to calculate the hashCode of the element which will help the collection to identify duplicates
	public int hashCode()
	{
//		System.out.println("hashcode for " + id + " = " + Integer.toString(id).hashCode());
		return Integer.toString(id).hashCode();
	}
	
//	Overriding equals() to compare the elements in the same bucket Of hashCode
	public boolean equals(Object obj) 
	{
//		System.out.println("this.id --> " + id + ", obj.id -->" + ((C)obj).id);
		return obj instanceof C && 
			   id == ((C)obj).id;
	}
}
public class M3 
{
	public static void main(String[] args) 
	{
		HashMap map = new HashMap();
		map.put(new C(150), "Object1");
		map.put(new C(200), "Object2");
		map.put(new C(300), "Object3");
		map.put(new C(150), "Object4");
		map.put(new C(200), "Object5");
		map.put(new C(300), "Object6");
		
		System.out.println("map : " + map);
//		for key 200 updated value will be Object6
//		after overriding hashCode() and equals now map is able to differentiate between same members of different object
	}
}

//		int i = 250;
//		System.out.println(Integer.valueOf(i).hashCode());
//		System.out.println(Integer.toString(i).hashCode());