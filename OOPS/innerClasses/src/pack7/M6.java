package pack7;

class Test 
{
	class A 
	{
	}
	
	static class B 
	{
	}
}

public class M6 
{
	public static void main(String[] args) 
	{
		
//		A a1 = null;
//		B b1 = null;
		
		Test.A a1 = null;
		Test.B b1 = null;
		
//		a1 = new Test().new A(); or
		
		Test t1 = new Test();
		a1 = t1.new A();
		
		Test.B b2 = new Test.B();
		
		b1 = new Test.B();
	}
}
// 1. We can not use A and B directly in M6.
// 2. .class file generate for every class no matter class is outer or inner class.
//3. 1. static 2. Non static 3. Local inner class
