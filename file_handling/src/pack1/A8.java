   package pack1;

import java.io.File;

public class A8 
{
	public static void main(String[] args) 
	{
//		We can also create Hierarchical directories 
		File file = new File("a/b/c/d/new_dir");
		
//		for multiple chain of directories use mkdirs();
		file.mkdirs();
	}
}
