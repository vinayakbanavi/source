package pack7;

public class M2 
{
	int i;

	void test1()
	{
		System.out.println("from test1");
	}
	
	static int j;
	
	static void test2()
	{
		System.out.println("from test2");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(j);
		test2();
//		System.out.println(i);
//		test1();
		M2 obj = new M2();
		System.out.println(obj.i);
        obj.test1();
		
		
	}
	

}
