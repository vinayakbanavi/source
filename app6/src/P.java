class P
{
	public static void main(String[] args) 
	{
		int i = 10;
		if (++i == i++) 
		{
			System.out.println("if block");
			i += 10; //i = i +10
		}
		System.out.println("main end :" + i);
	}
}
/*
if block
main end 22
*/