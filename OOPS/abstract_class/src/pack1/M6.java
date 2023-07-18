package pack1;

abstract class I
{
	void test1()
	{
		System.out.println("test1");
	}
}
public class M6 
{
	public static void main(String[] args) 
	{
		I obj1 = new I();
	}

}

/*
 Any class can be declared abstract it is optional
 But when class contains abstract method it must be declared as a Abstract class
 
 By declaring class as a Abstract we can Restrict object creation 
*/