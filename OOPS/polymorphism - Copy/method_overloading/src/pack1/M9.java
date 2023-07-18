/*
 		Method overloading from subclass
 */

package pack1;

class F
{
	void test(String s1)
	{
		System.out.println("test(String)");
	}
}

class G extends F
{
	void test(String ... s1)
	{
		System.out.println("test(var args)");
	}
}

public class M9 
{
	public static void main(String[] args)
	{
		G obj = new G();
		obj.test();
		obj.test("hii");
	}
}
