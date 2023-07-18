class A 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 5;
		switch(i)
		{
			case 1:
				System.out.println("from case 1");
			case 2:
				System.out.println("from case 2");
			case 3:
				System.out.println("from case 3");
			case 4:
				System.out.println("from case 4");
			case 5:
				System.out.println("from case 5");
		}
		System.out.println("main end");
	}
}

// SWITCH ARGUMENT SHOULD BE INT TYPE
//CASE VALUE ALWAYS SHOULD BE SWITCH ARGUMENT TYPE AND CONSTANT EXPRESSION (VALUE)
//CASES ORDER CAN BE ANY ORDER