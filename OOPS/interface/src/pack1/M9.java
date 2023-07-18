package pack1;

interface L
{
	void test1();
}

class M implements L
{
	
//	while implementing / Overriding superclass method.
//	Access specifier must be same or wider.
//	All the interface methods are public by default.
//	we must specify public.
	
	public void test1()
	{
		System.out.println("from test1");
	}
}

public class M9 
{
	public static void main(String[] args) 
	{
		M obj = new M();
		obj.test1();
	}
}

// When super member is a interface and sub member is a class We should use Implements.
// implements is a keyword used to develop connection between interface and class
// connection will be represented by dotted line.

