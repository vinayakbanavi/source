package pack3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A3 
{
	public static void main(String[] args) throws IOException
	{
//		if file is not available we will get exception
//	 	read operation always require available file
		
		File file = new File("unavilableFile.text");
//		Constructor arg for FileReader can be Existing file
		FileReader in = new FileReader(file);
		 
		char[] chars = new char[(int) file.length()];
		
		in.read(chars);
		
		String s1 = new String(chars);
		System.out.println(s1);
		
		in.close();
	}
}
