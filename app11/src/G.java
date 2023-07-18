class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1; i <= 100000 ; i *= 10 )  // i = i*10 
		{
			System.out.println("loop body : " + i);
		}
		System.out.println("main end");
	}
}
