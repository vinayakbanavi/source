package pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A2 
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("filewriternotes.text");
		

		FileWriter out =new FileWriter(f1);
		
//		by default write() will write the content in the same line that is from the last cursor location
//		we can use string \n
//		multiple execution will not append the content by default it will replace the content
		out.write("FileWriter is class available in java.io");
		out.write("\nFileWriter can be used to write into the suplied file");
		out.write("\nwrite(character content in to text file)");
		out.write("\nit will edit the file content internally");
		
		out.flush(); 
		out.close();
	}
}
