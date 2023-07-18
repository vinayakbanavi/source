package hashSet;

import java.util.HashSet;

class AadharNum
{
	private int uid;
	
	AadharNum(int uid)
	{
		this.uid = uid;
	}
	
	public String toString()
	{
		return uid + "";
	}
	
	public int hashCode()
	{
		return Integer.toString(uid).hashCode();
	}
	
	public boolean equals(Object obj)
	{
		return obj instanceof AadharNum && uid == ((AadharNum)obj).uid;
	}
}

public class M2 
{
	public static void main(String[] args) 
	{
		HashSet<AadharNum> set = new HashSet();
		set.add(new AadharNum(1234));
		set.add(new AadharNum(4321));
		set.add(new AadharNum(3214));
		set.add(new AadharNum(2143));
		set.add(new AadharNum(1234));
		set.add(new AadharNum(4321));
		
		System.out.println("generic Set : " + set);
		
//		we can only add AadharNum objects we can't add other Types
		
//		set.add(1234);
//		set.add(100.5);
//		set.add('A');
//		set.add(true);
//		set.add("String");
	}
}
