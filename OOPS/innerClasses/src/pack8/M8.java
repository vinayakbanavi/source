package pack8;

public class M8 
{
	static void method1(B b1)
	{
		b1.test1();
		b1.test2();
	}

	public static void main(String[] args) 
	{
		B b1 = new B() 
		{
			void test1()
			{
				System.out.println("from AIC test1");
			}
		};
		
		method1(b1);
		
		
		method1(new B() 
					{
						void test1()
						{
							System.out.println("from AIC2 test1");
						}
					}
			   );
	}
}
