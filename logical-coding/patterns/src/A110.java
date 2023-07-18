class A110
{
	public static void main(String[] args) 
	{		
		char k = 'a';
		for (int i = 1; i <= 11; i += 2)
		{
			for (int j = 1; j < 12 - i ; j += 2 )
			{
				System.out.print("  ");
			}

			for (int j = 1; j <= i ; j++ )
			{
				if (j == 1)
					System.out.print('a' + " ");
				else if (j == i)
					System.out.print(k + " ");
                    else
					System.out.print(i - j + " ");
			}
			k++;
			System.out.println();
		}
	}
}
	//System.out.print(j == 1 ? 'a' + " ": (j == i ? k++ : 5-j ) + " "); 
				//ternary takes only similar datatype results if there is difference it will give second type for both