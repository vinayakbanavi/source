package pack1;

class D
{
	public String test()
	{
		return "hello";
	}
}
public class M4 
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		String s1 = d1.test();
		
		D d2 = new D();
		String s2 = d2.test();
		
		D d3 = new D();
//		int i = d3.test(); type incompatible
		
//		For every Object of D test method will Return String
	}
}
