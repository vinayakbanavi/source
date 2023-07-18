class K 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println("outer do body begin : " + i);
			int j = 500;
			while (j <= 503);
			{
				System.out.println(" inner do body : " + i + ", " + j);
				j++;
			}
			System.out.println("outer do body end : " + i);
			i++;
		}
		while (i <= 5);
	}
}
