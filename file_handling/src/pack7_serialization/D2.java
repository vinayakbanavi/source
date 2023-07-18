package pack7_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class D2 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fin = new FileInputStream("c.ser");
		ObjectInputStream in =  new ObjectInputStream(fin);
		
		C c1 =(C) in.readObject();
		in.close();
		
		System.out.println("normal attribute i : "  + c1.i);
		System.out.println("transient attribute j : " + c1.j);
		System.out.println("static attribute k : " + c1.k);
	}
}
