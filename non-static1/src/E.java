class E 
{
	int i,j;

	E()
	{
		i = 500;
		j = 415;
	}

	public static void main(String[] args) 
	{
		E e1 = new E();
		E e2 = new E();
		System.out.println(e1.i + ", " + e1.j);
		System.out.println(e2.i + ", " + e2.j);
	}
}
