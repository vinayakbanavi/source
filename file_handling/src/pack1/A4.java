package pack1;

import java.io.File;

public class A4 
{
	public static void main(String[] args) 
	{
//		mkdir() in File class does not throw any Exception
//		mkdir() creates the directory for the given object;
		
//		by default the files will be created in the current directory
		File f1 = new File("spring_notes");
		f1.mkdir();
		
		File f2 = new File("java_notes");
		f2.mkdir();
		
//		We can also specify path of the target directory along with the file.type 
//		the path must be available
		File f3 = new File("D:/file_dest/sql_notes");
		f3.mkdir();
		
		File f4 = new File("D:/file_dest/movies");
		f4.mkdir();
	}
}
