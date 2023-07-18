package pack1;

class C
{
	static void test()
	{
		System.out.println("C - test");
	}
}

class D extends C
{
	static void test()
	{
		System.out.println("D - test");
	}
}
public class M2 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		C c2 = new D();
		
		C[] reference = {c1, c2};
		
		for (C ref : reference) 
		{
			ref.test();
//			C.test(); static members are called along with class name
//					  if we used reference variable, Compiler replaces ref with respective Class name
		}
	}
}

// static methods are class level members, Not involved in the method overriding
// And Resolved during compile time based on the reference variable;
// method hiding in place of overriding;
// static one time development, can not be modified further
// C class test method inherited to D but still acting as C member only not as D class Member.
// so implemented method despite of same signature, inherited C class member gets hide
// incorporated member becomes Subclass member
// Now in subclass two members are there
//     1) inherited Superclass member(hided)
//	   2) incorporated subclass member

// if inherited member becoming subclass member if we are developing same member with same signature
// Overriding will be taking place in that case only overrided member will be present in the subclass

