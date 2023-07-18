// Removing range of elements from the list

package pack2;

import java.util.ArrayList;

public class M6 extends ArrayList
{
	public static void main(String[] args) 
	{
//		ArrayList list1 = new ArrayList(); can not use protected members by creating object in the Super class
		
		M6 list1 = new M6();               // creating object in the sub class
		list1.add("index - 0");
		list1.add("index - 1");
		list1.add("index - 2");
		list1.add("index - 3");
		list1.add("index - 4");
		list1.add("index - 5");
		list1.add("index - 6");
		
		System.out.println("list1             : " + list1);
		
		list1.removeRange(2, 5);
		System.out.println("removeRange(2, 5) : " + list1);
		
		list1.removeRange(0, 0);
		System.out.println(list1);
	}
}

//		removeRange(fromIndex, toIndex) is protected method in class ArrayList
//		Protected members are used within same package
//		Inherited to any classes
//  	in order to use protected members we must inherit using extends
//      without inheritance gives Compilation Error : removeRange() is not visible

//		create object in the sub class	for inheritance
// 		in super class toString method is overridden so the same method will be inheriting to child class
//		so instead of getting memory address we get the elements 

// 		removeRange(fromIndex, toIndex)
//		fromIndex is included , toIndex is excluded

//      removeRange(1, 1) when fromIndex == toIndex does not throw error but does not remove any element
//		removeRange() return type is void



