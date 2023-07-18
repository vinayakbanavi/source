/*
 * 		DeSerialization :
 * 		Reconstruction of object from the bytes contained in the file
 * 
 * 		JVM checks for serial id
 * 		if there is difference in serialVersionUID between the compiled machine and local machine
 * 		
 * 		We will get an Exception
 * 		Exception in thread "main" java.io.InvalidClassException: 
 *      pack7_serialization.Person; 
 *      local class incompatible: 
 *      stream classdesc serialVersionUID = 1103492810783979652, 
 *      local class serialVersionUID = 8372640536058611188
 *      
 *      
 */


package pack7_serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class A2 
{
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
/*
 * 		DeSerialization :
 * 		Converting or Reading the file back to object
 * 		getting the object back to its state
 */
		
/* 		FileInputStream to carry Read Operations
 * 		specifying the path of existing serialized file
 * 		we must give serialized available path only, if will get exception
 */
		
		FileInputStream fin = new FileInputStream("a1.ser");
		
/* 		ObjectInputStream to carry object read operation
 * 		ObjectInputStream takes FileInputStream as constructor arg
 */
		ObjectInputStream in = new ObjectInputStream(fin);
		
/* 	
 * 		Converting file into Object
 * 		while serialization object will be upCasted to Object
 * 		readObject() returns Object type
 * 		DownCasting is required
 */
		
		
		Person p = (Person) in.readObject();
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		
	}
}
