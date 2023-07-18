package pack2;

import java.io.FileWriter;
import java.io.IOException;

public class A6 
{
	public static void main(String[] args) 
	{
		
//		Auto Resource Closure 
//		IO classes implements Closable
//		Objects declared in the parenthesis of try will close automatically if they implement Closable
		
		try(FileWriter out = new FileWriter("closure.txt", true))
		{
			out.write("writing in to the file\n");
		}
		catch (IOException ex) 
		{
			// IOException is a checked type so methods used n the try must be throwing IOException
//			or Exception objection must rise from the statements in the try
			ex.printStackTrace();
		}
	}
}
