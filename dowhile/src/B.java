class  B
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 10;
		do
		{
			System.out.println("do body : " + i);
			i--;
		}
		while (i >= 5);
		System.out.println("main end : " + i);
	}
}
