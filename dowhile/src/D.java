class D 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		do
		{
			int i =10;
			System.out.println("do body : " + i);
			i--;
		}
		while (i >= 5);
		System.out.println("main end : " + i );
	}
}
/*
whichever variable using in the boolean condition should not be local to the any other body
*/