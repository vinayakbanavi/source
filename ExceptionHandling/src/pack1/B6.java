class B6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try
		{
			System.out.println("try begin");
			int i = 10/0;
			System.out.println("try end");
		}
		catch (ArithmeticException ex)
		{
			System.out.println("from catch");
		}

		System.out.println("main end");
	}
}

/*
	try
	{
		for statements which probably produce abnormal condition
		(encapsulating statements)

		or also any number and any type of statements
	}
	catch(only one argument) 
	{
		catch(){}  must be immedietly after try {}
		------------------
		------------------
		------------------
		Any number of statements And any type of statements
	}

	catch argument should be Exception or Error
    should be a	Throwable type 
	Throwable is SuperClass to all the Exception and error

	if any arithmetic exception occurs inside a catch control goes into catch() {} to handle the exception
	catch executes only if exception rises in the try

*/