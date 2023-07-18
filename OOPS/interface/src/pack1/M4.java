package pack1;

interface G
{
	int i = 10;
	void test();
}

public class M4 
{
	G ref;                // using interface as data type for ref.
	
	void method (G g1)    // using interface as data type for argument for method.
	{
	
	}
	
	G method()            // using interface as return type.
	{
		return ref;
	}
	
	public static void main(String[] args) 
	{
		//G g1 = new G();
		G g2 = null;      // using interface as data type for local variable g2. 
		System.out.println("Done!");
	}

}

/*
-->	Inside a interface we can keep two kind of members.

	1. Constant e,g - i = 10; 
	 - in the interface every attribute is Static and final by default.
	 - Every attributes must be initialized at the place of declaration.
	 - in any programming language if attribute is static and final it is Perfect Constant
	 
	2. abstract method e,g - void test();
	 - By default every method of an interface is an abstract, so abstract is optional to keep
	 - we can't develop method with a body.
	 - but every method should end with semicolon inside an interface.
	 
--> Every member of the interface is always public by default.

     - We cannot make members of the interface as private or protected;
     
--> By default interface is not a public, but members of the interface are public by default.

--> We cant create object inside interface because of abstractness(incomplete);
     - But we can use the interface as Derived data type wherever possible.
     
*/