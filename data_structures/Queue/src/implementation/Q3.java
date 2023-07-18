/*
		Implementation using Linked list
		Time Complexity
		1. add    - O(1)
		2. remove - O(1)
		3. peek   - O(1)
*/
package implementation;

public class Q3 
{
	private Node head;
	private Node tail;
	
	class Node
	{
		
		private int data;
		private Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public boolean isEmpty()
	{
		return head == null;
	}
	
	public void add(int data)
	{
		Node newNode = new Node(data);
		
		if(isEmpty())
		{
			head = newNode;
			tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	public int poll()
	{
		if(isEmpty())
		{
			return -1;
		}
		int front = head.data;
		
		if(head == tail)
		{
			tail = null;
		}
		
		head = head.next;
		
		return front;
	}
	
	public int peek()
	{
		return head.data;
	}
	
	public static void main(String[] args) 
	{
		Q3 q = new Q3();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
//		System.out.println(q.peek());
		System.out.println(q.poll());
		q.add(50);
		
		System.out.println(q.poll());
		q.add(60);
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
}
