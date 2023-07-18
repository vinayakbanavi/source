class D
{
	int i;
	public static void main(String[] args) 
	{
		D d1 = new D();
		System.out.println(d1.i);
		d1.i = 1;
		System.out.println(d1.i);
		d1.i = 2;
		System.out.println(d1.i);
		d1.i = 3;
		System.out.println(d1.i);
		d1.i = 4;
		System.out.println(d1.i);
		d1.i = 5;
		System.out.println(d1.i);
		d1.i = 100;
		System.out.println(d1.i);
	}
}
//non static member loading to the memory only when the object is created
