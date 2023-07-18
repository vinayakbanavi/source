package pack7_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable
{
	int i;
}

/*
 *  if a current class implements Serializable and Holding other class obj
 *  which does not implements Serializable gives Compilation Exception
 *  So the Class of the object which we are using in serialized class must also implement Serializable
 */

class B implements Serializable
{
	int j;
	A a1;
}

public class C1 
{
	public static void main(String[] args) throws IOException
	{
		A a1 = new A();
		a1.i = 10;
		
		B b1 = new B();
		b1.j = 20;
		b1.a1 = a1;
		
		FileOutputStream fout = new FileOutputStream("b.ser");
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(b1);
		out.flush();
		out.close();
	}
}
