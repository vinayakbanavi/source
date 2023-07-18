package pack3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M5 
{
	public static void main(String[] args) 
	{
//		UpperBounded WildCards
		{
//  		List<Integer> list = new ArrayList<Integer>();
			List<Integer> list = new ArrayList();
			
			list.add(100);
			list.add(100);
			list.add(100);
			
//			Integer sum = sumOfList(list);
//			System.out.println("Summation of Integer list = " + sum);
			
			Double sum = sumOfListGen(list);
			System.out.println("Summation Of Integer list = " + sum);
		}
		
		{
			List<Double> list = new ArrayList();
			
			list.add(10.0);
			list.add(10.0);
			list.add(10.0);
			
			Double sum = sumOfListGen(list);
			System.out.println("Summation Of Double list = " + sum);
		}
		
//		LowerBound WildCard
		{
			ArrayList<Integer> list1 = new ArrayList();
			addNumbers(list1);
			System.out.println(list1);
			
			ArrayList<Double> list2 = new ArrayList();
//			addNumbers(list2);
//			System.out.println(list2);
		}
	}
	
	
//	NonGeneric Method
	public static Integer sumOfList(List<Integer> list)
	{
		Integer sum = 0;
		for (Integer obj : list)
		{
			sum += obj;
		}
		
		return sum;
	}
	
//	UpperBound WildCard
//	used for in Parameters
//	we are just using it for some operation not modification to the original list
	public static Double sumOfListGen(List<? extends Number> list)
	{
		Double sum = 0.0;
		for (Number obj : list)
		{
			sum += obj.doubleValue();
		}
		
		return sum;
	}
	
//	UnBounded WildCard
	public static void addNumbers1(List<?> list)
	{
		for (Object object : list) 
		{
			System.out.println(object);
		}
	}
	 
//	LoweBound WildCard 
//	Used for Out Parameters 
//	used for modifying the original list
	public static void addNumbers(List<? super Integer> list)
	{
		for (int i = 1; i <= 10; i++) 
		{
			list.add(i);
		}
	}
	
}
