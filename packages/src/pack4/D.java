package pack4;  

class A
{
	private int i;

	private void test()
	{
		System.out.println("A - test()");
	}

}

class D extends A
{
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.i);
		d1.test();
	}
}