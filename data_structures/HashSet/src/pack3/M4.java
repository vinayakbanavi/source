package pack3;

import java.util.HashSet;

class D
{
//	when class containing multiple attribute
	String username;
	int password;
	
	D(String username, int password)
	{
		this.username = username;
		this.password = password;
	}
	
	public String toString()
	{
		return "(" + username + ", " + password + ")"; 
	}
	
	public int hashCode()
	{
//		hashCode() built in method of String class returns int value
		return username.hashCode() + Integer.toString(password).hashCode();
	}

	public boolean equals(Object obj)
	{
		return obj instanceof D && 
			   username == ((D)obj).username && 
			   password == ((D)obj).password;
	}
}

public class M4 
{
	public static void main(String[] args) 
	{
		HashSet set = new HashSet();
		set.add(new D("vinayak", 1234));
		set.add(new D("vinayak", 1234));
		set.add(new D("vinayak", 4321));
		set.add(new D("vinayak", 4321));
		set.add(new D("vinayak", 1235));

		System.out.println(set);
	}
}


/**
 		Flow of Execution :
 		
 		Set is a collection of unique elements 
 		whenever new object/Element is added to the set
 		
 		
 		HashMap<Integer, List<Object>> HashBucket = new HashMap();
 		
// 		Set class add method
 		add(Object obj)
 		{
		/** calls the hashCode method implemented in the entity class.
		    which is loaded into the memory of the object. /

 			int hashCode = obj.hashCode();
 			boolean check = false;
 			
 			if (hasBucket.containsKey(hashCode))
 			{
		/**		if hashBucket already contains the hashCode
		 		internally call obj.equals()  by supplying already available Object with same hashCode
		 		equals() will check the members of two objects are same or what
		 		if same it will return true /
		 		
		 		ArrayList<Object> list = HashBucket.get(hashCode);
		 		
		 		for (int i = 0; i < list.size() && check != true; i++)
		 		{
		 			Object compareObj = list.get(i);
 					check = obj.equals(compareObj);
		 		}
		 		
		 		if(!check)
		 		{
		 			list.add(obj);
		 			HashBucket.put(hashCode, list);
		 		}
 			}
 			
// 			if equals method returns false it will added into the same 
 			else
 			{
 				HashBucket.put(hashCode,new ArrayList().add(obj));
				/** adds the obj to the set  /
 			}
 		}
*/
