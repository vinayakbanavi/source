package pack8;

public class M6 
{
	public static void main(String[] args) 
	{
//		B is a abstract class so we can't instantiate without implementation 
		//B b1 = new B();
		
		B b2 = new B()
		{
			void test1()
			{
				System.out.println("AIC-test1");
			}		
		};
		
		b2.test1();
		b2.test2();
	}
}
// Inner classes cannot be abstract 
// Because we can't inherit anonymous inner class (No further implementation) 
// Main purpose is to provide anonymous implementation
