class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for (int i = 1; i <= 10 ; i++ )  
		{
			System.out.println("loopy body begin : " + i);
			i++;
			System.out.println("loopy body end : " + i );
		}
		System.out.println("main end");
	}
}
