package pack6_binary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A3
{
	public static void main(String[] args) 
	{
//		using Auto resource closure
		File source = new File("C:\\Users\\user\\Desktop\\Graphs\\java-exceptions-hierarchy-example.png");
		File target = new File("exception.png");
		
		try(FileInputStream fin = new FileInputStream(source);
			BufferedInputStream bin = new BufferedInputStream(fin);
			FileOutputStream fout = new FileOutputStream(target);
			BufferedOutputStream bout = new BufferedOutputStream(fout)) 
		{
			byte[] data = new byte[(int) source.length()];
			
			bin.read(data);
			bout.write(data);
		} 
		catch (IOException ex) 
		{
			ex.printStackTrace();
		}
	}
}
