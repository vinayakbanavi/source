package pack1;

import java.io.File;
import java.io.IOException;

public class A3 
{
	public static void main(String[] args) 
	{
		System.out.println("step1 : created new file object with absolutepath + fileName.type" );
		File file = new File("G:/file_dest/SpringNotes.txt");
		
		try
		{
			System.out.println("step2 : try begin ");
//			if path not exist/available exception will rise
			file.createNewFile();
			System.out.println("step3 : try end ");
		}
		catch(IOException ex)
		{
			System.out.println("step4 : rised Exception in try catched");
			ex.printStackTrace();
		}
		
		System.out.println("step4 : main end");
	}
}
