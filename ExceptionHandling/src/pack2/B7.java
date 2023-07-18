class B7
{
	public static void main(String[] args) 
	{
		try
		{
			java.sql.DriverManager.getConnection("");
		}
		catch (java.sql.SQLException ex)
		{
		}
	}
}

// Every Statement of jdbc require try catch speciallised in SQLException