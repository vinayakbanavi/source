class C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i =50;i <= 100 ; i += 5 )     // i += 5 ----> i = i + 5;
		{
			System.out.println("loopy body : " + i);
		}
		System.out.println("main end");
	}
}
