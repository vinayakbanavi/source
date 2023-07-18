package pack7_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class C2
{
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fin = new FileInputStream("b.ser");
		ObjectInputStream in = new ObjectInputStream(fin);
		
		B b1 = (B) in.readObject();
		in.close();
		
		A a1 = b1.a1;
		
//		System.out.println(a1.i);
		System.out.println(b1.a1.i);
		System.out.println(b1.j);
	}
}
