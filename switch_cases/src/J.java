class J
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 40;
		switch(i)
		{
			case 100:
				System.out.println("from case 100");
				break;
			default:
				System.out.println("from case 18");
			    break;
			case 1:
				System.out.println("from case 1");
			    break;
			case 3:
				System.out.println("from case 3");
			    break;
			default:	
				System.out.println("from case 19");
			    break;
			case 4:
				System.out.println("from case 4");
			    break;

		}
		System.out.println("main end");
	}
}

// ERRROR - DUPLICATE DEFAULT LABEL
// TWO DEFAULT BLOCKS ARE NOT ALLOWED
// MAXIMUM ONE DEFAULT BLOCK ALLOWED