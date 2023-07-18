class E
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
			case 1:
				System.out.println("from case 1");
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

//TO COME OUT FROM A PARTICULAR CASE IT REQUIRES A BREAK IN THAT PARTICULAR CASE
//IT IS RECOMENDED TO PLACE BREAK IN ALL THE CASES