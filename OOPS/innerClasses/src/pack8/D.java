package pack8;

class C
{
	C()
	{
		System.out.println("C()");
	}
	
	{
		System.out.println("C-IIB");
	}
}

public class D extends C
{
	D() 
	{
		System.out.println("()");
	}
	
	{
		System.out.println("D-IIB");
	}

}
