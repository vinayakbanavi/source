package pack8;

public class M7 
{
	static void test1(A obj) 
	{
		obj.test1();
		obj.test2();
	}
	
	public static void main(String[] args) 
	{
		test1(new A());
		
		System.out.println("--------------------");
		
		test1(new A() 
				{
					void test1() 
					{
						System.out.println("AIC-test1");
					}
				}
			 );
		
		System.out.println("----------------------");
		
//		Inner classes can be used to instant implementation And can be supplied as the method argument
		test1(new A() 
				 {
					void test2() 
					{
						System.out.println("AIC-test2");
					}
				 }
		     );
		
		System.out.println("----------------------");
		
		test1(new A() 
				{
					void test1() 
					{
						System.out.println("AIC-test1");
					}
					void test2() 
					{
						System.out.println("AIC-test2");
					}
				}
			 );
	}
}
// 