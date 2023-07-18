class D 
{
	public static void main(String[] args) 
	{
		int i = 20;
		int j = --i;
			j = ++i;
		System.out.println(i); // 20
		System.out.println(j); // 20
	}
}
