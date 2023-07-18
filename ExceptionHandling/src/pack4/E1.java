package pack4;

class E1
{
	public static void main(String[] args) 
	{
		if(args.length == 0)
		{
			System.out.println("please provide one command line argument");
			return;
		}
		
		int age = Integer.parseInt(args[0]);

		if (age <= 0)
		{
			throw new NullPointerException("age should be greater than zero");
		}

		System.out.println("your age is : " + age);
	}
}
