package pack2;

interface E
{
	void test1();
}

interface F extends E
{
	void test2();
}

class G implements F
{
	public void test1()
	{
		System.out.println("G - test1");
	}
	
	public void test2()
	{
		System.out.println("G - test2");
	}
}

public class M15 
{
	public static void main(String[] args) 
	{
		G g1 = new G();
		g1.test1();
		g1.test2();
	}	
}

/*
  in Inheritance
  class to class         ---> extends
  interface to interface ---> extends
  interface to class     ---> implements
 */

