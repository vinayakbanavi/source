package pack4;

// We can define our own Exception Class
class AgeIsNegativeException extends RuntimeException
{
	
	AgeIsNegativeException()
	{

	}

	AgeIsNegativeException(String message)
	{
		super(message);
	}

}
class E2
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
			throw new AgeIsNegativeException("age should be greater than zero");
		}

		System.out.println("your age is : " + age);
	}
}
