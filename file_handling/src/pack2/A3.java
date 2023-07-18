package pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A3 
{
	public static void main(String[] args) throws IOException
	{
		File f1 = new File("filewriternotes.text");
		

//		multiple execution will not append the content by default it will replace the content
//		in order to make the append we need to supply true along with file

//		FileWriter out =new FileWriter(File file,Boolean append);
		FileWriter out =new FileWriter(f1, true);
		
//		by default write() will write the content in the same line that is from the last cursor location
//		we can use string \n
	
		out.write("\nAppending into existing file");			
	
		
		out.flush(); 
		out.close();
	}
}
