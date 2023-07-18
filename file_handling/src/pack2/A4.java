package pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A4
{
	public static void main(String[] args) throws IOException
	{

//		Instead of supplying File reference we can directly supply file name into the FileWriter
//		File file = new File("avengers.txt");
//		FileWriter out =new FileWriter(file, true);

//		FileWriter out =new FileWriter(File file,Boolean append);
		FileWriter out =new FileWriter("avengers.txt", true);
		
//		by default write() will write the content in the same line that is from the last cursor location
//		we can use string \n
	
		out.write("\nAppending into existing file");			
	
		
		out.flush(); 
		out.close();
	}
}
