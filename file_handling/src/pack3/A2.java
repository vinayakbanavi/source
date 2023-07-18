package pack3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A2 
{
		public static void main(String[] args) throws IOException
		{
			File file = new File("hello.text");
//			Constructor arg for FileReader can be Existing file
			FileReader in = new FileReader(file);
			
//			file.length() returns long(total number of characters in the file)
//			but dataType of Array size in ArrayClasses are int so downcast is necessary  
			char[] chars = new char[(int) file.length()];
			
//			read(char[] array) will store the characters from the file into array 
			in.read(chars);
			
			String s1 = new String(chars);
			System.out.println(s1);
			
			in.close();
		}
}
