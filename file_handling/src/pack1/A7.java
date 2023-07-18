package pack1;

import java.io.File;

public class A7 
{
	public static void main(String[] args) 
	{
//		Constructors are Overloaded in File Class
		File f1 = new File("notes");
		File f2 = new File(f1, "java");
		
		f2.mkdir();
	}
}
