package pack1;

public class M1
{
	public static void main(String[] args) 
	{
		byte b1 = 100;
		int i = b1;                      // int i = (int) b1; auto widening by compiler;
		double j = b1;					 // double j = (double) b1;
		System.out.println("done");
	}
}

/*
 	Casting --> conversion of one data type to other type
 	
	--> primitive number type
	 	byte
	 	short
	 	int
	 	long
	 	float
	 	double
 	
							 				Auto widening 
							 	---->    ----->   ------> ------------->
							 	byte < short < int < long < float < double
							 	<--   <----    <-------   <-------------
							 			  explicit Narrowing
 			
 	Auto widening - Done automatically done by the compiler
 	while assignment if right side operand is narrower than the left side operand auto widening will done by compiler. 
 	Explicit narrowing - Explicitly need to downcast
 	
 */

