package implementationUsingLinkedList;

public class Stack<T>
{
	private Node head;
	
	class Node
	{
		private T data;
		private Node next;
		
		Node(T data)
		{
			this.data = data;
			next = null;
		}
	}
	
	public boolean isEmpty()
	{
		return (head == null);
	}
	
	public boolean push(T data)   //1 3
	{
		Node newNode = new Node(data);
		
		if(isEmpty())
		{
			head = newNode;
			return true;
		}
		
		newNode.next = head;
		head = newNode;
		
		return true;
	}
	
	public T pop()
	{
		if(isEmpty())
		{
			return null;
		}
		T top =  head.data;
		head = head.next;
		return top;
	}
	
	public T peek()
	{
		return  head.data;
	}
}