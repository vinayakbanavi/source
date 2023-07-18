package pack7_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Base implements Serializable
{
	int i;
}

class Sub extends Base
{
	int j;
}

public class B1
{
	public static void main(String[] args) throws IOException
	{
/*
 * 		Serialization
 */
		Sub obj = new Sub();
		obj.i = 10;
		obj.j = 20;
/*
 * 		Target file to store the converted object
 */
		FileOutputStream fout = new FileOutputStream("sub.ser");
		
/*
 * 		Object write operation
 */
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(obj);
		out.flush();
		out.close();
	}
}
