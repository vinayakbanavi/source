package pack4;  

class A
{
	private int i;

	private void test()
	{
		System.out.println("A - test()");
	}

}

class B
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
		a1.test();
	}
}