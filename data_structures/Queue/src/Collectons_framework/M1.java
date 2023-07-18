package Collectons_framework;

import java.util.LinkedList;
import java.util.Queue;

public class M1 
{
	public static void main(String[] args) 
	{
//		Queue<Integer> q1 = new Queue()    
//		Queue(Interface) we cannot create object directly
//		but we can use it as a data type
		
//		ArrayDeque and LinkedList both implements Queue
		
//		implementing with LinkedList
		{
			Queue<Integer> q1 = new LinkedList<>();
//			q1.add(10);
//			q1.add(20);
//			q1.add(30);
//			q1.add(40);
//			q1.add(40);
//			q1.add(40);
			
//			Queue allows duplicates
//			Queue preserves Order of addition
	

//			1. remove() vs poll()
/*			{
				
//			*	remove() 
//				removes the first element in the queue and returns the element
//				throws exception if queue is empty : NoSuchElementException
				System.out.println("remove() retrives the data and remove");
				System.out.println(q1);
				System.out.println(q1.remove());
				System.out.println(q1);
				
//			*	poll()
//				returns the first element and remove it
//				return null if Queue is empty
				System.out.println("\npoll() retrives the data and remove");
				System.out.println("Queue : " + q1);
				System.out.println(q1.poll());
				System.out.println("Queue : " + q1);			
			}
*/
			
//			2. element() vs peek()
			{	
//			*	element()
//				retrieves the first element from the Queue
//				throws exception
				System.out.println("\nelement() will retrieve the first element from the Queue");
				System.out.println(q1);
//				System.out.println(q1.element());
				
//			*	peek() 
//				will return the first element in the queue
//				returns null if queue is empty
				System.out.println("\npeek() will retrieve the first element from the queue");
				System.out.println(q1);
				System.out.println(q1.peek());
			}

/*
			in addition we can also access other method in LinkedList
			1. add(int index);
			2. addAll
			3. contains
			4. retains
			5. removeAll
			
			etc,
*/
			
		}
		
//		for <String>
		{
			Queue<String> q1 = new LinkedList<>();
			q1.add("Vinayak");
			q1.add("Avinash");
			q1.add("Sudhanva");
			q1.add("Darshan");
			
			System.out.println(q1);
			
			q1.remove();
			
			System.out.println(q1);
			System.out.println(q1.peek());
		}
	}
}
