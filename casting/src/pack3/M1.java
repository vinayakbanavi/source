package pack3;

class A 
{
	int i;
}

class B extends A 
{
	int j;
}

class C extends B 
{
	int k;
}

public class M1 
{
	public static void main(String[] args) 
	{
		A a1 = new B();

		System.out.println(a1.i);

//		System.out.println(a1.j);
//		Compilation error : cannot resolve j

//		a1 is a reference to object in class B.
//		object in B contains inherited members from its super class.
//		but reference variable is of A type, hence compiler will allow only A class attributes.
//		So we can't access the attributes of B class directly from A class reference
//		Even though object containing the B class attributes 

		
		  A a2 = new C();
		  System.out.println(a2.i); 
//		  System.out.println(a2.j); //
//		  System.out.println(a2.k);
		  
		  B b1 = new C();
		  System.out.println(b1.i);
		  System.out.println(b1.j);
//		  System.out.println(b1.k);
	 }
}
/*
 * so from above program we can understand we can access members from the
 * Specific reference class members and superclass members But not the members
 * from subclass.
 */