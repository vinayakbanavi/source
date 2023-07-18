package pack7_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class B2 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		
/*
 * 		DeSerialization
 */
		FileInputStream fin = new FileInputStream("sub.ser");
		
		ObjectInputStream in = new ObjectInputStream(fin);
		
//		Assigning to Base(Parent)
		{
//			Base obj =(Base) in.readObject();
			
//			System.out.println(obj.i);
//			System.out.println(obj.j);
		}
//		Assigning to Sub
		{
			Sub obj = (Sub) in.readObject();
			System.out.println(obj.i);
			System.out.println(obj.j);
			
		}
		
		in.close();
	}
}
