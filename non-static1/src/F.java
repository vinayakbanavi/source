class F 
{
	int i;

	F(int arg1)
	{
		i = arg1;
	}

	public static void main(String[] args) 
	{
		F f1 = new F(10);
		F f2 = new F(20);
		F f3 = new F(60);
		System.out.println(f1.i);
		System.out.println(f2.i);
		System.out.println(f3.i);
	}
}
