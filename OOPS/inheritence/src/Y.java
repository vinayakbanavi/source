class A
{
	static
	{
		System.out.println("A - SIB"); 
	}

}
class B extends A
{
	static
	{
		System.out.println("B - SIB"); 
	}

}

class Y extends B
{
	static
	{
		System.out.println("Y - SIB"); 
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main end");
	}
}
