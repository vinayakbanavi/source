package pack2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class A1 
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("hello.text");
		
//		constructor arg for FileWriter can be both existing or non existing file
		FileWriter out =new FileWriter(f1);
		
//		if file already exits write() will directly write the content
//		it will first create the file and write the content
		
		out.write("FileWriter is class available in java.io");
		out.write("FileWriter can be used to write into the suplied file");
		out.write("write(character content in to text file)");
		out.write("it will edit the file content internally");
	
//		after write() operation it is general practice to flush() & close()
//		flush() forcibly write the trapped/leftover content into the file
		out.flush(); 
		
//		after usage of physical connection established with the existing file, close it.
		out.close();
	}
}
