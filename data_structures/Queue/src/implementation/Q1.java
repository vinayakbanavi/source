/*
 	Queue :
 	Properties of Queue : First In First Out(FIFO)
 	
	for the following SingleEnded implementation
	Time Complexity 
	1. add O(1)
	2. peek + remove O(n)
*/
package implementation;

public class Q1 
{
	static class Queue
	{
		static int[] elements;
		static int size;
		static int rear = -1;
		
		Queue(int size)
		{
			this.size = size;
			elements = new int[size];
		}
		
//		checks whether queue is empty
		public boolean isEmpty()
		{
			return rear == -1;
		}
		
//		add
//		0 1 2 3 4
		public  void add(int data)
		{
			if(rear == size - 1)
			{
				return;
			}
			
			elements[++rear] = data;
		}
		
//		remove
		
		public int poll()  //2 6 7 1 
		{
			if (isEmpty())
			{
				return -1;
			}
			
			int front = elements[0];
			for(int i = 0; i < rear ; i++)
			{
				elements[i] = elements[i+1];
			}
			rear--;
			return front;
		}
		
//		peek 
		public  int peek()
		{
			if(isEmpty())
				return -1;
			
			return elements[0];
		}
	}
	
	public static void main(String[] args) 
	{
		Queue q = new Queue(5);
		q.add(2);
		q.add(6);
		q.add(7);
		q.add(1);
		q.add(1);

//		q.add method not giving any exception for adding elements beyond array capacity
		q.add(1);

		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
}
