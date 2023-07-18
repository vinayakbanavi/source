package pack1;

interface S
{
	void test1();
}

interface T
{
	void test2();
}

class U implements S, T  
// multiple inheritance - One class can implement any no of super interfaces with ',' as a separator.
{
	public void test1()
	{
		System.out.println("U - test1");
	}
	public void test2()
	{
		System.out.println("U - test2");
	}
}
public class M12
{
	public static void main(String[] args) 
	{
		U u1 = new U();
		u1.test1();
		u1.test2();
		
	}

}
