package Collectons_framework;

import java.util.ArrayDeque;
import java.util.Queue;

public class M2 
{
	public static void main(String[] args) 
	{
//		implementing using ArrayDeque
		
		Queue<Integer> q = new ArrayDeque<>();
		q.add(85);
		q.add(53);
		q.add(13);
		q.add(60);
		q.add(80);
		
		System.out.println(q);
		
//		removes the front in the queue
		q.remove();
		System.out.println(q);
		
//		returns the front in the queue
		System.out.println(q.peek());
		
	}
}
/*										
				Difference between ArrayDeque and LinkedList implementation
				
				ArrayDeque                       LinkedList
			1.  Uses Dynamic Array internally    Uses Nodes(chunks of memory) internally	
			    contiguous memory allocation     non contiguous memory allocation	
				
			2.  Read operation  - O(1)	         O(n)
			3.  Write Operation - O(n)           O(1)
			4.  memory -                         extra allocation for storing pointer to next O(n) 
			
			
			efficient Queue implementation
			where all the operation Time complexity is O(1) 
 */



