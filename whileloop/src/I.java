class  I
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
        while (i <= 5)
        {
			System.out.println("outer loop begin : " + i);
			int j = 500;
			while (j <= 503)
			{
				System.out.println("inner loop : " + i + ", " + j);
				j++;
			}
			System.out.println("outer loop end" + i);
			i++;
        }
		System.out.println("main end : " + i);
	}
}
