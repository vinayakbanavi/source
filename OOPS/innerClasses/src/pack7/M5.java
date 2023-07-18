package pack7;

public class M5 
{
	static class A 
	{
	}

	class B 
	{
	}

	public static void main(String[] args) 
	{

//		we can directly create object to static inner class
		A a1 = new A();

//		We can't create object directly to non static inner class
//		B b1 = new B()
		
		
		M5 obj = new M5();

//		we must create the object to the non static inner class along with the reference of the outer class
		B b1 = obj.new B();
	}

}
