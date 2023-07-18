package pack1;

import java.io.File;

public class A9 
{
	public static void main(String[] args) 
	{
//		We can check whether existing file is a Directory or file
		File f1 = new File("notes");
		File f2 = new File("test1.txt");
		
		System.out.println(f1.isFile());
		System.out.println(f1.isDirectory());
		
		System.out.println(f2.isFile());
		System.out.println(f2.isDirectory());
		
	}
}
