// Declaration of enum inside a class

package pack1;

public class M2 
{
	static void test()
	{
/*
 		JDK version 1.8
		We can declare an enumeration inside a class.		
		But, we cannot define an enum inside a method. 
		If you try to do so it generates a compile time error saying “enum types must not be local”
*/		
		enum Face{Head, Tail}
	}
	public static void main(String[] args) 
	{
		
	}
}
