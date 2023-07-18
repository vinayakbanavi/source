/*
 		Circular queue implementation using array
 		it is best way of implementing Queue 
 		
 		Time complexity
 		1. add    O(1)
 		2. remove O(1)
 		3. peek   O(1)
 */

package implementation;

public class Q2 
{
	static class Queue
	{
		static int size;
		static int[] elements;
		static int rear = -1;
		static int front = -1;
		
		Queue(int size)
		{
			this.size = size;
			elements = new int[size];
		}
		
		public static boolean isEmpty()
		{
			return rear == -1 && front == -1;
		}
		
		public static boolean isFull()
		{
			return (rear + 1)% size == front;
		}
		
		public static void add(int data)
		{
			if(isFull())
			{
				return;
			}
			
//			first element add
			if(front == -1)
			{
				front = 0;
			}
			rear = (rear + 1)% size;
			elements[rear] = data;
		}
		
		public static int poll()
		{
			if(isEmpty())
			{
				return -1;
			}
			
			int result = elements[front];
			
//			if only one element
			if(rear == front)
			{
				front = rear = -1;
			}
			else
			{
				front = (front + 1)%size;
			}
			
			return result;
		}
		
		public static int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			
			return elements[front];
		}		
	}
	
	public static void main(String[] args) 
	{
		Queue q1 = new Queue(5);
		q1.add(10);
		q1.add(20);
		q1.add(30);
		q1.add(40);
		q1.add(50);
		System.out.println(q1.poll());
		q1.add(100);
		System.out.println(q1.poll());
		q1.add(200);
		
		
		System.out.println("\niteration");
		while(!q1.isEmpty())
		{
			System.out.println(q1.poll());
		}
	}
}
