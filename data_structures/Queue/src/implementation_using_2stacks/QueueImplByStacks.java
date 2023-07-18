/*
 		efficient Queue
 		All operations must have O(1) Time Complexity
 		
 		Queue --> First In First Out(FIFO)	
 		Stack --> Last In First Out(LIFO)
 		
 		Even by using two stack we can't achieve efficient queue
 		either we can achieve efficiency in add Operation or remove operation
 */


// remove O(1)  - remove efficient implementation
package implementation_using_2stacks;

import java.util.Stack;

public class QueueImplByStacks 
{
	class Queue<E>
	{
//		using two stacks
		private Stack<E> s1 = new Stack<>();
		private Stack<E> s2 = new Stack<>();
		
		public boolean isEmpty()
		{
			return s1.isEmpty();
		}
		
		public void add(E data)
		{
//			check whether stack1 is empty or not
//			if it contain elements shift them one by one to s2(empty stack) until all elements are shifted
			
//			push will add the element to the stack at the top
//			pop will remove last added element from the stack
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			
//			now s1 is empty we can add the data to s1 to make last added element
			s1.add(data);
			
//			shift  back all the elements from s2 to s1
			
			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
		}
		
		public E remove()
		{
			if(isEmpty())
			{
				return null;
			}
			
			return s1.pop();
		}
		
		public E peek()
		{
			if(isEmpty())
			{
				return null;
			}
			
			return s1.peek();
		}
	}
}
