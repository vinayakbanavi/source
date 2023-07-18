/*
 * BufferReader :
 */

package pack5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class A1 
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("read1.txt");
		
//		We must supply the available file as an argument for read operation
		FileReader fileReader = new FileReader(file);
		
//		BufferedReader takes FileWriter as a constructor argument
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
//		ReadLine() will retrive all the characters in the single line
//		if blank line/characters not found returns null
//		will increament the current line for every iteration(call)
		String data = bufferedReader.readLine();
		
		while(data != null)
		{
			System.out.println(data);
			data = bufferedReader.readLine();
		}
		
		bufferedReader.close();
		fileReader.close();
	}
}
