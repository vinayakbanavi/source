class M
{
	public static void main(String[] args) 
	{
		int i = 10; // if block require boolean
		if (i = 10) // if(i) ---> error incompatible type int cannot be converted to boolean
		{
			System.out.println("if block"); 
		}
		System.out.println("main end :" + i);
	}
}
