package pack5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A3
{
	public static void main(String[] args) 
	{
//		Auto Resource Closure
		
		File file = new File("read1.txt");    
		
		try (FileReader fileReader = new FileReader(file); BufferedReader bufferedReader = new BufferedReader(fileReader))
		{
			String s1 = bufferedReader.readLine();
			
			while(s1 != null)
			{
				System.out.println(s1);
				s1 = bufferedReader.readLine();
			}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
}
