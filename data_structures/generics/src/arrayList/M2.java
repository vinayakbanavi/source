package arrayList;

import java.util.ArrayList;

class Person
{

}

public class M2 
{
	public static void main(String[] args) 
	{
		ArrayList<Person> list = new ArrayList();
		list.add(new Person());
		list.add(new Person());
		list.add(new Person());
		list.add(new Person());
		
//		list.add("String");  // in generic list <Person> we can add only Person type objects
//		list.add(10);

		list.add(null);      // null is the default value for derived type
	}
}
