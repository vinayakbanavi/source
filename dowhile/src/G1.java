class G1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		do
		{
			System.out.println("do body begin  : " + i);
			if (i == 3)
			{
				i++;
				continue;
			}
            System.out.println("do body end : " + i);
			i++;
		}
		while (i <= 5);
		System.out.println("main end : " + i);
	}

}
