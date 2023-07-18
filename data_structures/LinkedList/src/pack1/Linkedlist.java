package pack1;

import java.util.Iterator;

public class Linkedlist 
{
	private Node head;
	private int size;
	
	Linkedlist()
	{
		size = 0;
	}
	
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data = data;
			next = null;
			size++;
		}
	}
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		
//		tracking must be done through temporary pointer to avoid loss of address if used head directly 
		Node currNode = head;
		
		if (currNode == null)
		{
			return "[]";
		}
		
		while(currNode != null)
		{
			sb.append(currNode.data + ", ");
			currNode = currNode.next;
		}
		return "[" + sb.substring(0, sb.length() - 2) + "]";
	}
	
	public void addFirst(String data)
	{
		Node newNode = new Node(data);
		if (head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(String data)
	{
		Node newNode = new Node(data);
		
		if (head == null)
		{
			head = newNode;
			return;
		}
		
		Node currNode = head;
		
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	public void add(int index, String data)
	{
		if (index < 0 && index > size)
		{
			throw new IndexOutOfBoundsException("index " + index + " is out of Bounds for size " + size);
		}
		
		Node newNode = new Node(data);
		
		if (index == 0)
		{
			newNode.next = head;
			head = newNode;
			return;
		}
		
		Node currNode = head;   // A (C) B C D
		int count = 0;
		
		for (int i = 0 ; i < index - 1 ; i++)
		{
			currNode = currNode.next;
		}
		
		newNode.next = currNode.next;
		currNode.next = newNode;
	}
	
	public void removeFirst()
	{
		if (head == null)
		{
//			System.out.println("list is empty");
			return;
		}
		
		head = head.next;
		size--;
	}
	
	public void removeLast()
	{
		if (head == null)
		{
			return;
		}
		
		size --;
		if (head.next == null) // when only one node in last
		{
			head = null;     
			return;
		}
		
		Node secondLast = head;
		Node last = head.next;
		
		while(last.next != null)  // A B C null
		{
			secondLast = last;
			last = last.next;
		}
		
		secondLast.next = null;
	}
	
	public int size()
	{
		return size;
	}
	
	public String get(int index)
	{
		if (index < 0 || index > size - 1)
		{
			throw new IndexOutOfBoundsException("index " + index + " out of bounds for size " + size);
		}
		
		Node currNode = head;
		for (int i = 0; i < index ; i++)
		{
			currNode = currNode.next;
		}
		
		return currNode.data;
	}
	
	public void remove(int index)
	{
		if (index < 0 || index > size - 1)
		{
			throw new IndexOutOfBoundsException("index " + index + " out of bounds for size " + size);
		}
		
		Node currNode = head;
		for (int i = 0; i < index - 1 ; i++)
		{
			currNode = currNode.next;
		}
		
		currNode.next = currNode.next.next;
		size--;
	}
	
	public void clear()
	{
		head = null;
	}
	
	public boolean contains(String data)         // A B C D
	{
		Node currNode = head;
		
		for (int i = 0; i < size ; i++)
		{
			if (currNode.data.equals(data)) 
			{
				return true;
			}
			
			currNode = currNode.next;
		}
		
		return false;
	}
	
	public static void main(String[] args) 
	{
		Linkedlist list = new Linkedlist();
		list.addFirst("abc");
		list.addFirst("first");
		list.addLast("last");
		list.addLast("newlast");
		list.addFirst("newfirst");
		System.out.println("list : " + list);
		list.add(4, "inserted");
		System.out.println("list : " + list);
		
		System.out.println(list.contains("newfirst"));
		
	}
}
