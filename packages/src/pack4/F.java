package pack4;

class A 
{
	private A()
	{
		System.out.println("A()");
	}
}
class F extends A
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
