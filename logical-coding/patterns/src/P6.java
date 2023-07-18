class P6 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <= 16 ; i += 4 )
		{
			for (int j = 29; j - i < 29    ; j += 2 )
			{
				System.out.print(i == 0 ? 29 + " " : j + i + " ");
			}
		    System.out.println();
		}
	}
}

/*
0  2   4  6  8
29
33 35  
37 39 41
41 43 45 47
45 47 49 51 53
*/