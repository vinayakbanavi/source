class H
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
			case 1:
				System.out.println("from case 1");
			    break;
			case 3:
				System.out.println("from case 3");
			    break;
			case 4:
				System.out.println("from case 4");
			    break;
		    default:
				System.out.println("from case 54");
			    break;
		}
		System.out.println("main end");
	}
}

// IF NO CASES IS SUITABLE DEFAULT BLOCK WILL EXECUTE
//DEFAULT CAN BE ANYWHERE INSIDE THE SWITCH BLOCK