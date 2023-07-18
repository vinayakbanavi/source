// Traversing/Reading enum

package pack1;

public class M4 
{
	enum Direction{North, South, East, West, NorthEast, NorthWest, SouthEast, SouthWest}
	
	public static void main(String[] args) 
	{
		
/*
 		Concept Understanding :
 		
 		public static final Direction North = new Direction();
 		
 		1. Can we declare an Object static?
 		   There is no such thing as static object in java
 		   the variable that pointing towards an object can be static.
 		   
 		   The idea of Object being static has no meaning.
 		   
 		2. The Purpose of a static variable or any other static type member?
 		   is to attach the member to type itself rather than to an instance of the type
 		   
 		   We can use Object from the class directly without instantiation
 */
		
//		1. we can directly read the enum Constants like a static attribute
		System.out.println(Direction.North);
		
//		2. We can also use enum as a datatype
		Direction d1 = Direction.NorthEast;
		System.out.println(d1);
		
//		3. We can read the ordinal or index of the specific Constant using ordinal() 
		System.out.println(Direction.South.ordinal());
		int ordinal = Direction.North.ordinal();
		
//		4. We can use Advanced loop
//		values() method will return an Array of Constants
		for (Direction direction : Direction.values())
		{
			System.out.println(direction);
		}
		
//		5. valueOf(String s1) will return the specific value of Given constant 
		System.out.println(Direction.valueOf("North"));
	}
}

































