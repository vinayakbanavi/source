/*
 		Method Override
 		
 		Overriding is possible only with inheritance
 		Cannot Override a method in same class
 		Cannot override attributes
 		cannot override static methods
 		
 		Conditions to be followed
 		
 		1. Access Specifier
 			should be same or wider
 			
 		2. static methods can't be override with non static and vice versa
 		
 		3. return type must be same
 			or Covariant of a class
 		
 		4. Identifier should be same
 		
 		5. Signature should be same
 */

package pack1;

class C
{
	void test()
	{
		System.out.println("C - test");
	}
}

class D extends C
{
	void test()                             // method overriding (updating / replacing)
	{
		System.out.println("D - test");
	}
}

public class M2 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		d1.test();
	}
}

// in the method overriding  there will be no change in the signature
// superclass method will be replaced by the subclass method
// overriding cannot possible in a single class, it happens only between two classes 