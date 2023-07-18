class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 4;
		switch(i)
		{
			case 100:
				System.out.println("from case 100");
				break;
			case 100:
				System.out.println("from case 1");
				System.out.println("from case 2");
				System.out.println("from case 3");
				System.out.println("from case 4");
				System.out.println("from case 5");
			    break;
			case 2:
				System.out.println("from case 2");
			    break;
			case 16:
				System.out.println("from case 16");
			    break;
			case 3:
				System.out.println("from case 3");
			    break;
			case 4:
				System.out.println("from case 4");
			    break;
			case 39:
				System.out.println("from case 39");
			    break;
			case 5:
				System.out.println("from case 5");
			    break;
		}
		System.out.println("main end");
	}
}

// ERROR - DUPLICATE CASE LABEL
// CASE VALUE MUST BE UNIQUE TWO CASE MUST NOT HAVE THE SAME VALUES
