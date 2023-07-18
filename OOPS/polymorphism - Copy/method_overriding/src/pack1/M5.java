package pack1;

class I
{
	void test(int i)
	{
		System.out.println("I - test");
	}
}

class J extends I
{
	void test(int x)
	{
		System.out.println("J - test");
	}
}

public class M5 
{
	public static void main(String[] args) 
	{
		J j1 = new J();
		j1.test(100);
	}
}
