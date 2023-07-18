package pack1;

import java.io.File;
import java.io.IOException;

public class A6 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("To create file inside Existing Directory");
//		System.out.println("\nMultiple argument constructor");
		{
//			Directory must be existing
			File directory = new File("display-pictures");
			System.out.println("step1 : directory.exists() - " + directory.exists() );
						
			File file = new File(directory, "image1.jpg");
			
			System.out.println("step2 : " + file.exists() );
			
			try
			{
				System.out.println("step2 : " + file.createNewFile());
			}
			catch(IOException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
	}
}
