class D9
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		try
		{
			System.out.println("from try");
		}
		finally
		{
//			try without catch,Possible.
//			Here we are not Handling any Exception
//			Acheving Execution of some mandatory statements via finally
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}

/*	
		Allowed Combination of try - catch - finally

		try - catch
		try - catches
		try - catch - finally
		try - catches - finally
		try - finally
*/
