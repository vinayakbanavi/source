class  H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
        while (i <= 5)
        {
			System.out.println("outer loop begin : " + i);
			for (int j = 500; j <= 503; j++ )
			{
				System.out.println("inner loop : " + i + ", " + j);
			}
			System.out.println("outer loop end" + i);
			i++;
        }
		System.out.println("main end : " + i);
	}
}
