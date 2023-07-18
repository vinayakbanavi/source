package implementation_using_array;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/*
 		Queue - First in first out(FIFO)
 		Front <---[1, 2, 3, 4]<----Rear
 		
 		linked list, PriorityQueue implements Queue
 		
 		Basic Operations
 		1. Add     Enque
 		2. Remove  Deque
 		3. Front   Peek
 		
 		
 		Queue interface
 		{
 		
 		 	Insertion Operation
	 			Both will add a new element to the tail of a queue if its not full
	 			if full
	 			1. boolean add(E e);    --> throw illegalStateException. 
	 			2. boolean offer(E e);  --> returns false.
	 			
	 		Extraction Operation
	 			the following methods will return head of the queue and will remove the first element
	 			if queue is empty
	 			1. E remove();          --> throw NoSuchElementException
 				2. E poll();            --> return null if if the queue is empty
 				
 			Inspection Operation
 				the following methods will return the first element(head) if Queue is not empty
 				if empty 
 			    1. E element();         --> throw Exception
 			    2. E peek();            --> return null
 		
 		}
 		
 		
 		so we can implement Queue with following possibilities
 		1. FIFO, fixedSize
 		2. FIFO, fixedSize , When queue is full old element will get removed
 		
 */
public class Qyu<E> implements Queue<E>
{
	private int size = -1;
	private E[] elements;
	private int capacity;
 	
 	Qyu(int capacity)
 	{
 		this.capacity = capacity;
// 		Object[] array = new Object[capacity];
// 		elements = (E[])array;
 		elements = (E[]) new Object[capacity];
 	}
 	
// 	will add the element to the tail
// 	if array is full return false
 	
 	public boolean offer(E e)
 	{
 		if (size == capacity)
 		{
 			System.out.println("Queue is full");
 			return false;
 		}
 		elements[++size] = e;
 		return true;
 	}
 	
 	public boolean add(E e)
 	{
 		if (size == capacity)
 		{
 			throw new IllegalStateException("");
 		}
 		elements[++size] = e;
// 		System.out.println("executing");
 		return true;
 	}
 	
 	public E poll()
 	{
 		if(size == 0)
 		{
 			return null;
 		}
 		
 		E front = elements[0];
 		
 		for(int i = 0; i < size - 1 ; i++)
 		{
 			elements[i] = elements[i+1];
 		}
 		size--;
 		return front;
 	}
 	
 	public E remove()
 	{
		if(size == 0)
 		{
 			throw new NoSuchElementException();
 		}
 		
 		E front = elements[0];
 		
 		for(int i = 0; i < size - 1 ; i++)
 		{
 			elements[i] = elements[i+1];
 		}
 		size--;
 		return front;
 	}
 	public String toString()
 	{
 		StringBuffer sb = new StringBuffer();
 		
 		for (int i = 0; i < size ; i++)
 		{
 			sb.append(elements[i] + ", ");
 		}
 		
 		return "["+ sb.substring(0, sb.length() -2) + "]";
 	}
 	
// 	The following methods are yet to implement
 	
 	@Override
 	public E element() 
 	{
 		return elements[0];
 	}
 	
 	@Override
 	public E peek() 
 	{
 		if (isEmpty())
 			return null;
 			
 		return elements[0];
 	}

	@Override
	public int size() 
	{
		return size;
	}

	@Override
	public boolean isEmpty() 
	{
		return size == -1;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
