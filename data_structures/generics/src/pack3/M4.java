package pack3;

interface H<T>
{
	void print(T arg);
}

class J<T> implements H<T>
{	
	public void print(T arg)
	{
		System.out.println("Printing from subclass : " + arg);
	}
}
public class M4 
{
	public static void main(String[] args) 
	{
		H<Integer> h1            = new J();
//		super interface variable = subclass Object
//		subclass will implements the interface with the Same DataType
		
		h1.print(100);
//		h1.print("hello");  --> compile time error
		
		H<String> h2 = new J();
		h2.print("hello");
	}
}
