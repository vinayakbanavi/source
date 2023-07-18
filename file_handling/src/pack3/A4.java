package pack3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A4 
{
	public static void main(String[] args) 
	{
		File file = new File("avengers.txt");
		try(FileReader in = new FileReader(file))
		{
			char[] c = new char[(int) file.length()];
			
			in.read(c);
			
			String data = new String(c);
			System.out.println(data);
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
