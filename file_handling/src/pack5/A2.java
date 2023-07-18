package pack5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A2 
{
	public static void main(String[] args) /* throws not required */
	{
		/* Handling the Exception in the main */
		
		File file = new File("read1.txt");
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		
		try 
		{
			fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			String data = bufferedReader.readLine();
			
			while(data != null)
			{
				System.out.println(data);
				data = bufferedReader.readLine();
			}
			
		} 
		catch (IOException ex) 
		{
//			Catch the Raised Exception Object in try
//			if given file doesn't exist constructor in BufferedReader will throw IOException
			
			ex.printStackTrace();
		}
		finally 
		{
			if (bufferedReader != null)
			{
				try 
				{
					bufferedReader.close();
				}
				catch (IOException ex) 
				{
					ex.printStackTrace();
				}
			}
			if (fileReader != null)
			{
				try 
				{
					fileReader.close();
				}
				catch (IOException ex) 
				{
					ex.printStackTrace();
				}
			}
		}
		
		System.out.println("Exception Handling in try catch");
	}
}
