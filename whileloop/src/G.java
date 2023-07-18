class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		while (i <= 5)
		{
			System.out.println("body begin : " + i);
			if (i == 3)
			{
				i++;
				continue;
			}
			System.out.println("body end : " + i);
			i++;
		}
			System.out.println("main end : " + i);
	}
}
