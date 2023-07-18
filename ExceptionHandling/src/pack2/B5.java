class B5
{
	public static void main(String[] args) 
	{
		try
		{
			int i = 100;
//          Even though try is not empty it never thrown ClassNotFoundException
//			Compilation Error
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
}
