class E 
{
	int i;
	public static void main(String[] args) 
	{
		E ref = new E();
		System.out.println(ref.i);
		ref.i = 9;
		System.out.println(ref.i);
		ref.i = -2;
		System.out.println(ref.i);
		ref.i = 0;
		System.out.println(ref.i);
		ref.i = -2000;
		System.out.println(ref.i);
	}
}
