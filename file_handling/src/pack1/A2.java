package pack1;

import java.io.File;
import java.io.IOException;

public class A2 
{
	public static void main(String[] args) 
	{
//		 createNewFile() in File class throws IOException(Checked)
		
		File file = new File("Manager.java");
		System.out.println("step1 : " + file.exists() );
		
		try
		{
			System.out.println("step2 : " + file.createNewFile());
		}
		catch(IOException ex)
		{
//			System.out.println(ex);
//			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
		System.out.println("step3 : " + file.exists());
		
	}
}
