package pack5;

class A
{
	public static void main(String[] args) 
	{
		G g1 = new G();          
		System.out.println("hello world");
	}
}

/* 

- We cannot use any Class from a different Package directly even though the class is public.
- The class must be public in order to use from another package.
- while usage we must specify package name or import.

*/