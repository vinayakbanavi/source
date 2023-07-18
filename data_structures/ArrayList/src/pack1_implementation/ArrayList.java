package pack1_implementation;

import java.util.Iterator;
import java.util.ListIterator; 

public class ArrayList
{
	private Object[] elements;
	private int size;
	private int capacity;
	
	public ArrayList()
	{
		capacity = 10;
		elements = new Object[capacity];
	}
	
	public ArrayList(int capacity)
	{
		this.capacity = capacity;
		elements = new Object[capacity];
	}

	private void alterCapacity()
	{
		capacity = capacity + (capacity / 4);
		Object[] temp = elements;
		elements = new Object[capacity];
		
		for (int i = 0; i < size; i++) 
		{
			elements[i] = temp[i];
		}
	}
	
	public void add(Object obj)
	{
		if (size == capacity)
		{
			alterCapacity();
		}
		
		elements[size ++] = obj;
	}
	
	
	public void add(int index, Object obj)
	{
		if (size == capacity)
		{
			alterCapacity();
		}
		
		if(index >= 0 && index < size)
		{
			Object[] temp = elements;
			elements = new Object[capacity];
			
			for (int i = 0, j= 0; i < size; i++) 
			{
				if (i == index)
				{
					elements[i] = obj;
					size++;
				}
				else
					elements[i] = temp[j++];
			}
			
			temp = null;
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
		}
	}

	public void addAll(ArrayList list)
	{
		for (int i = 0; i < list.size; i++) 
		{
			if(size == capacity)
				alterCapacity();
			
			elements[size++] = list.get(i);
		}
	}
	
	public void addAll(int index, ArrayList list)
	{
		if(index < 0 || index > size)
		{
			throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
		}
		
		Object[] temp = elements;
		capacity = size +list.size;
		elements = new Object[capacity]; // a b c d       e f g
		
		for (int i = 0, k = 0; i < capacity;)
		{	
			if (i == index)
			{
				for (int j = 0; j < list.size; j++) 
				{
					elements[i++] = list.get(j); 
					size++;
				}
			}
			else
			{
				elements[i++] = temp[k++];
			}
		}
	}
	
	public String toString()
	{
		if (size == 0)
		{
			return "[]";
		}
		StringBuffer sb = new StringBuffer();
		
		for (int i = 0; i < size; i++) 
		{
			sb.append(elements[i] + ", ");
		}
		
		return "[" + sb.toString().substring(0, sb.toString().length() - 2) + "]";
	}
	
	public int size()
	{
		return size;
	}
	
	public Object get(int index)
	{
		if (index >=0 && index < size)
			return elements[index];
		else
			throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
	}
	
//	update/replace the existing element
	public Object set(int index, Object obj)
	{
		Object replaced = elements[index];
		elements[index] = obj;
		return replaced;
	}
	
	public void clear()
	{
		capacity = 10;
		elements = new Object[capacity];
		size = 0;
	}
	
	public boolean contains(Object obj)
	{
		for (int i = 0; i < size; i++) 
		{
			if(elements[i] == obj)
			{
				return true;
			}
		}
		return false;
	}
	
	public boolean containsAll(ArrayList list) 
	{
//		a b c d   b c f
		
		for (int i = 0; i < list.size; i++)
		{
			if (!contains(list.get(i)))
			{
				return false;
			}
		}
		
		return true;
	}
	
	public Object remove(int index)
	{
		if (index >= 0 && index < size)
		{	
//			1 2 3 4 	
			--size;
			Object removed = elements[index];
			
			for (int i = index ; i < size; i++)
			{
				elements[i] = elements[i + 1];
			}
			
			return removed;
			
		}
		else
			throw new ArrayIndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
	}
	
	public boolean remove(Object obj)
	{
//		if (contains(obj))
//		{
//			Object[] temp = elements;
//			capacity = size;
//			elements = new Object[capacity]; // a b c d   
//			size = 0;
//			
//			for (int i = 0; i < capacity; i++) 
//			{
//				if (temp[i] == obj) 
//				{
//					continue;
//				}
//				else
//				{
//					elements[size++] = temp[i];
//				}
//			}
//			return true;
//		}
//		else
//		return false;
		
		
		if (contains(obj))
		{
			remove(indexOf(obj));
			return true;
		}
		else
		{
			return false;
		}
	}
	
	protected void removeRange(int fromIndex, int toIndex) // 0 1 2 3 4 5 6 7
	{
		if(fromIndex >= 0 && fromIndex <= toIndex && toIndex < size )
		{	
			for (int i = 0; i < size; i++) 
			{
				if (i >= fromIndex && i < toIndex)
				{
					remove(i);
					toIndex--;
					i--;
				}
			}
		}
		else
		{
			if (fromIndex < 0 || fromIndex > size)
				throw new ArrayIndexOutOfBoundsException("Index " + fromIndex + " out of bounds for length " + size);
			if (toIndex < 0 || toIndex > size)
				throw new ArrayIndexOutOfBoundsException("Index " + toIndex + " out of bounds for length " + size);
			else
				throw new IllegalArgumentException(fromIndex + " > " + toIndex );
		}
	}
	
	public void removeAll(ArrayList list)
	{
		if(list.size == 0)
		{
			return;
		}
		
		if (list.size == size && containsAll(list))
		{
			size = 0;
			capacity = 10;
			elements = new Object[capacity];
			return;
		}
		
		for (int i = 0; i < list.size; i++) 
		{
			remove(list.get(i));
		}
	}
	
	public void retainAll(ArrayList list)
	{
		if(list.size == 0)
		{
			return;
		}
		
		if (list.size == size && containsAll(list))
		{
			size = list.size;
			capacity = size;
			elements = toArray(list);
			return;
		}
		
		for (int i = 0; i < size; i++)
		{
			if(!list.contains(elements[i]))
			{
				remove(i--);
			}
		}
	}
	
	public Object[] toArray(ArrayList list)
	{
		Object[] obj = new Object[list.size];
		
		for (int i = 0; i < list.size; i++) 
		{
			obj[i] = list.get(i);
		}
		return obj;
	}
	
	public int indexOf(Object obj)
	{
		if (contains(obj))
		{
			for (int i = 0; i < size; i++) 
			{
				if (elements[i] == obj) 
				{
					return i;
				} 
			}
		}
		return -1;
	}
	
	public int indexOf(Object obj, int fromIndex)
	{
		if (contains(obj))
		{
			for (int i = fromIndex; i < size; i++) 
			{
				if (elements[i] == obj) 
				{
					return i;
				} 
			}
		}
		return -1;
	}
	
	public int lastIndexOf(Object obj)
	{
		if (contains(obj))
		{
			for (int i = size - 1; i >= 0 ; i--) 
			{
				if (elements[i] == obj) 
				{
					return i;
				} 
			}
		}
		return -1;
	}
	
	public int lastIndexOf(Object obj, int fromIndex)
	{
		if (contains(obj))
		{
			for (int i = fromIndex; i >= 0 ; i--) 
			{
				if (elements[i] == obj) 
				{
					return i;
				} 
			}
		}
		return -1;
	}
	
	
	public Iterator iterator()
	{
		return new Iterator() 
		{
			private int track;
			
			public boolean hasNext() 
			{
				return track < size;
			}
			
			public Object next() 
			{
				return get(track++) ;
			}
		};
	}
	
	public ListIterator listIterator()
	{
		return new ListIterator() 
		{
			private int track;
			
			public boolean hasNext() 
			{
				return track < size;
			}

			public Object next()
			{
				return get(track++);
			}

			// a b c d e
			public boolean hasPrevious() 
			{
				return track >= 0;
			}

			public Object previous()
			{
				return get(--track);
			}

			public int nextIndex() 
			{
				return track + 1;
			}

			public int previousIndex() 
			{
				return track - 1;
			}

			public void remove() 
			{
				ArrayList.this.remove(track);
			}

			public void set(Object obj) 
			{
				ArrayList.this.set(track, obj);
			}

			public void add(Object e)
			{
				// Yet to implement	
			}
		};
	}
}

