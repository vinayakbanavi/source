 package pack1;

class A
{
	void test()
	{
		System.out.println("A - test");
	}
}

class B extends A
{
	void test()
	{
		System.out.println("B - test");
	}
}
public class M1 
{
	public static void main(String[] args) 
	{
		 A a1 = new A();
		 A a2 = new B();
		 A[] elements = {a1, a2}; 
//		 references are A type even though they are referring to Objects from different class
//		 so we can store them in A type Array
		 
		 for (A a : elements) 
		 {
			a.test(); 
		 }
	}
}

// polymorphism can be achieved through overriding and upcasting.
// changes taking place in the runtime 
// non static members are Object type, resolved by JVM based on Object
