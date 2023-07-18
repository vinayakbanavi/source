package pack2;

import java.util.HashSet;

public class M1 
{
	public static void main(String[] args) 
	{
//		HashSet is a built in class, part of Collection framework
		
//		HashSet<Object> set = new HashSet<Object>(); 
		HashSet set = new HashSet();
		
		set.add(null);
		set.add(10);
		set.add(0.57);
		set.add('A');
		set.add(false);
		set.add("hello");
		
		System.out.println("set allows all type of elements ");
		
		System.out.println("set : " + set);
		
		System.out.println("\nBy default set wont allow duplicates ");
		System.out.println("adding \"element\" for the first  time --> " + set.add("element"));
		System.out.println("adding \"element\" for the second time --> " + set.add("element"));
		System.out.println("updated set : " + set);
		
//		System.out.println("Attempting insertion add(index, element) : " + set.add(0, "insert"));
		
		HashSet set1 = new HashSet();
		set1.add(100);
		set1.add(10);
		set1.add(true);
		set1.add("hii");
		set1.add('A');
		
		System.out.println("\nAdding all the elements of one set to other set\n");
		System.out.println("set              : " + set);
		System.out.println("set1             : " + set1);
		System.out.println("set.addAll(set1) : " + set.addAll(set1));
		System.out.println("updated set      : " + set);
		
//		System.out.println("\nAttempting to insert all elements of one set in other set \n" + set.addAll(0,set1));
		
	}
}

/*
 	
 	Iterable <-extends- Collection <-extends- Set <---implements-- HashSet
 	Set is a collection (group) of unique elements.
 	Set don't allow duplicates.
	
	set.add() is used to add elements to the set.
			  it returns boolean value.
			  if the duplicate is added it wont show compilation error or exception instead returns false;
			  
	HashSet - Order of addition is not preserved.
			- so index is not fixed as per the order of addition.
	
	add(index, element) --> Insertion is not possible in HashSet
			
  	addAll()- Only adds unique elements from one set to the other set
  			- it skips the element, if it is already present in the current set.
  			- returns boolean value
  			 
 */
