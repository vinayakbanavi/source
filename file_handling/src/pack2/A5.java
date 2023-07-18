package pack2;

import java.io.FileWriter;
import java.io.IOException;

public class A5 
{	
	public static void main(String[] args) 
	{
		
		FileWriter out = null;
//		out is local to method and can be used inside any block in the same method
//		handling the thrown exception through try catch
		
		try
		{
//			out = new FileWriter("newfile.doc", true); extention can be doc also
			out = new FileWriter("newfile.txt", true);
			out.write("writing in to the file\n");
		}
		catch (IOException ex) 
		{
			// IOException is a checked type so methods used n the try must be throwing IOException
//			or Exception objection must rise from the statements in the try
			ex.printStackTrace();
		}
		finally
		{
			if(out != null)
			{
				try
				{
					out.flush();
					out.close();
				}
				catch (IOException ex)
				{
					ex.printStackTrace();
				}
			}
		}
		
		System.out.println("content written into file succefully ");
	}
}
