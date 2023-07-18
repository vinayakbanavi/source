/*
 * Serialization :
 * Converting an object into sequence of bytes and storing it into the file
 */


package pack7_serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable
{
	private String firstName;
	private String lastName;
	
	Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName() 
	{
		return lastName;
	}	
}

public class A1 
{
	public static void main(String[] args) throws IOException 
	{
/*
 * 		Serialization :
 * 		Converting or writing the objects state into file
 * 		Creating object to the Person class
 */
		Person p1 = new Person("Vinayak", "Banavi");
		

/*
 * 		Establishing connection the target file
 * 		if target file doesn't exist it will create the file at the specified path
 * 		we can use any extension,
 * 		but while other extension type are not serialized
 * 		we must save with .ser
 */
		FileOutputStream fout = new FileOutputStream("a1.ser");
		
/*
 *		In order to write Objects content into the file
 *		Using built in ObjectOutputStream to do write operations
 */

		ObjectOutputStream out = new ObjectOutputStream(fout);
		
//		writing the objects content into the file
		out.writeObject(p1);
		out.flush();
		out.close();
	}
}
