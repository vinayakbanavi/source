class  V
{
	V()
	{
		System.out.println("V()");
	}

	{
		System.out.println("V - IIB");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		V v1 = new V();
		System.out.println("main end");
	}
}

/*

if super() is the first statement of the constructor, IIB block content will be incorporated(moved) to constructor body after super() statement

A()
{
  1) super calling statement	        Super();
	                                    {
  2) IIB content						    System.out.println("A - IIB");
	                                    }
  3) Original Constructor content	    System.out.println("A()");
}

*/