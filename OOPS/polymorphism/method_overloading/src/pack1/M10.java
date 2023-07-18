package pack1;

class H
{
	void test(Long x , Long y)
	{
		System.out.println("test(Long, Long)");
	}
	
	void test(long ... x)
	{
		System.out.println("test(long ... args)");
	}
	
	void test(Integer x, Integer y)
	{
		System.out.println("test(Integer, Integer");
	}

	void test(Number x , Number y)
	{
		System.out.println("test(Number , Number)");
	}
}

public class M10 
{
	public static void main(String[] args) 
	{
		H obj = new H();
		
		short s = 7;
		 
		obj.test(s, s);
		obj.test(7);
	}
}
