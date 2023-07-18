class A
{
	static int i;
	
	static
	{
		System.out.println("from A.SIB");
	}
}

class  H
{	
	static
	{
		System.out.println("from H.SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
		System.out.println("----------");
		System.out.println(A.i);
		System.out.println("----------");
		System.out.println(A.i);
		System.out.println("----------");
		System.out.println("main end");

	}
}
