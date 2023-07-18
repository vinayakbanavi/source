public class A9 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

//		Creating array of StringBuffer of size 999999999
		StringBuffer[] elements = new StringBuffer[999999999];
		
//		Assigning new Object at each index 
		for(int i = 0; i < elements.length ; i++)
		{
			elements[i] = new StringBuffer("abc");
		}
		
//		each Object consuming some Heap Memory
//		for total size of Array, memory not sufficient
		
//		Abnormality - OutOfMemoryError
//		Not handled FLow get Terminates
		
		System.out.println("main end");
	}
}