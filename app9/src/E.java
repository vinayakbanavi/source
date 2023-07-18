class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("if block");
		}
		else if(true)                            //if block inside the body of the else block
			{
				System.out.println("if2");
			}

		System.out.println("main end");
	}
}

//else body can have if else