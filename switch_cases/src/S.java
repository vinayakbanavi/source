class S 
{
	public static void main(String[] args) 
	{
		byte b1 = 100;
		switch (b1)
		{
		case 20:
		System.out.println("from case 20");
		case 100:
		System.out.println("from case 100");
		case 150:
		System.out.println("from case 150");
		
		}
	}
}
// ERROR - INCOMPATIBLE TYPES : POSSIBLE LOSSY CONVERSION FROM INT TO BYTE
// every case value should be in the range of switch argument type