package pack1;

import java.io.File;

public class A5
{
	public static void main(String[] args) 
	{
		System.out.println("file without/default path");
		{
			File f1 = new File("images");
			System.out.println("step1 : " + f1.exists());
	
//			if the file already exists at the given path, mkdir() will return false
			System.out.println("step2 : " + f1.mkdir());
	
			System.out.println("step3 : " + f1.exists());
		}
		
		System.out.println("\nfile with avavailable path");
		{
			File f1 = new File("D:/file_dest/project");
			
			System.out.println("step1 : " + f1.exists());
			
//			if the file having available path, mkdir() will return true for the first time(if file already not exist) 
			System.out.println("step2 : " + f1.mkdir());
			
			System.out.println("step3 : " + f1.exists());
		}

		System.out.println("\nfile with unavavailable path");
		{
			File f1 = new File("G:/project");
			
			System.out.println("step1 : " + f1.exists());
			
//			if the file having unavailable path, mkdir() will return false 
			System.out.println("step2 : " + f1.mkdir());
			
			System.out.println("step3 : " + f1.exists());
		}
		
	}
}