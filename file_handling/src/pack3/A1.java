package pack3;

import java.io.FileReader;
import java.io.IOException;

public class A1
{
	public static void main(String[] args) throws IOException
	{
//		Constructor arg for FileReader can be Existing file
		FileReader in = new FileReader("hello.text");
		
//		char[] to store the chars from the file
		char[] chars = new char[50];
		
//		read(char[] array) will store the characters from the file into array 
		in.read(chars);
		
		String s1 = new String(chars);
		System.out.println(s1);
		
		in.close();
	}
}
