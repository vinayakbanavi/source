package pack1;

class B 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
		System.out.println(A.j);
		a1.test();
		A.main(args);
	}
}
