package pack2;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class M7 
{
	public static void main(String[] args) 
	{
	
//		set of planets
		{
			HashSet set = new HashSet();
			set.add("mercury");
			set.add("venus");
			set.add("mars");
			set.add("earth");
			set.add("jupiter");
			set.add("saturn");
			set.add("uranus");
			set.add("neptune");
			
			System.out.println("set of planets : " + set);
			
//			sorting of set using TreeSet
//			TreeSet is a built in class which sorts the elements in the given set
			
//			TreeSet set1 = new TreeSet(set);   /* initialization through constructor */
			TreeSet set1 = new TreeSet(Collections.reverseOrder());   
			set1.addAll(set);				   /* initialization through method */
			
			
			System.out.println("Sorted by name : " + set1);
		}
	}
}
