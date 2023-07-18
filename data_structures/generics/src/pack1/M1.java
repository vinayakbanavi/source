package pack1;

class A
{
	int i;
}

public class M1 
{
	public static void main(String[] args) 
	{
//		class A
		{
			A a1 = new A();
			a1.i = 25;
			
			A a2 = new A();
			a2.i = 50;
			
			A a3 = new A();
			a3.i = 100;
			
			a A4 = new A();
//			a4.i = "hello";  --> type incompatible
			
//			As we observe data type of i remains same for all the objects in A
		}
	}
}
