/*
 * All the class and Interface used to perform file related operations 
 * Available in java.io package
 */

package pack1;

import java.io.File;
import java.io.IOException;

public class A1 
{
	public static void main(String[] args) throws IOException
	{
//		Any file type can be created using createNewFile()
		
//		we can provide any type of file name as a constructor arg
//		by default all the files will get saved to the current directory
		File f1 = new File("test1.txt");
		f1.createNewFile();
		
		File f2 = new File("hello.html");
		f2.createNewFile();
		
//		we can also specify target path along with file name
//		we must suuply absolute path
//		only available path is allowed
		File f3 = new File("D:\\file_dest\\abc.doc");
		f3.createNewFile();
		
//		in linux only forward slash is supported
//		we can also use forward slash
		File f4 = new File("D:/file_dest/moon.jpg");
		f4.createNewFile();
		
				
	}
}
