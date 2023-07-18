package pack2;

class B4
{
	public static void main(String[] args) 
	{
		try
		{
//            catch with Checked Argument Cumpolsorily require suitable rised Exception object
//            Compilation Error : M.java:10: error: exception ClassNotFoundException is never thrown in body of corresponding try statement

//            empty try is possible only with UnChecked Exception 
//            not with checked Exception
		}
		catch (ClassNotFoundException ex)
		{
		}
	}
}
