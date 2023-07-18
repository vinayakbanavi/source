package pack7_serialization;

/*
 * Serialization is the process of storing object members in to the file
 * static members are class level, 
 * So while object is storing into the file static members will be stored with default value
 * transient : short lived, non static (part of the object)
 * is a keyword used to filter from the serialization
 * static and transient members not surviving the serialization
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class C implements Serializable
{
	int i;
	transient int j;
	static int k;
}

public class D1 
{
	public static void main(String[] args) throws IOException 
	{
		C obj = new C();
		obj.i = 10;
		obj.j = 20;
		obj.k = 30;
		
		FileOutputStream fout = new FileOutputStream("c.ser");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(obj);
		out.flush();
		out.close();
	}
}
