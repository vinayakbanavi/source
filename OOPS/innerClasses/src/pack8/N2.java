package pack8;

public class N2 
{
	public static void main(String[] args) 
	{
		//E e1 = new E();
		//E is interface so we can't create object to it.
		
//		implementing the interface directly through Anonymous class 
		E e2 = new E() 
		{ 
			public void test1()
			{
				System.out.println("E-test1");
			}
			public void test2()
			{
				System.out.println("E-test2");
			}
		};
		
		e2.test1();
		e2.test2();
	}

}