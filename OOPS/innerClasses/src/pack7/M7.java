package pack7;

public class M7 
{
	public static void main(String[] args) 
	{
		class A
		{
			void test()
			{
				System.out.println("test");
			}
		}
		
		A a1 = new A();
		a1.test();
	}
}
//  it is local inner class. a class inside method, constructor, IIB, SIB, or block. like local variable.
// w.r.t local inner class there should be one condition should be follow.