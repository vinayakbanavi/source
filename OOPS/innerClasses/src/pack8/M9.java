package pack8;

public class M9 
{
	static A method1()
	{
		return new A();
	}
	
	static A method2()
	{
		return new A() 
		{
			void test1()
			{
				System.out.println("from AIC test1");
			}
		};
	}
		
	static B method3()
	{
		return new B() 
		{
			void test1()
			{
				System.out.println("from AIC2 test1");
			}
		};
	}
		
	public static void main(String[] args) 
	{
		A a1 = method1();
		a1.test1();
		a1.test2();
		System.out.println("-----------------------------------");
		A a2 = method2();
		a2.test1();
		a2.test2();
		System.out.println("-----------------------------------");
		B b1 = method3();
		b1.test1();
		b1.test2();
	}
}
