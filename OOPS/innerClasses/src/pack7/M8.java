package pack7;

public class M8 
{
	int field = 10;
	public static void main(String[] args) 
	{
	    int i = 10;
		int j = 10;
		class A 
		{
			
			void test() 
			{
				System.out.println(i);
//				System.out.println(j);
//				System.out.println(field);
			}
		}
		
		A a1 = new A();
		a1.test();
		
		j = 20;
		a1.test();
	}


	void test()
	{
//		A a1 = new A(); Inner class must be used within the block where it is implemented
	}
	
}
/*
		Local Inner class
		
		Access the local Variables of the enclosing block
		Local variables cannot be modified inside local class
		Inner classes can be developed inside any closed block i,e - Methods, if block, loop body
		Are not considered as a member of Enclosing class these are restricted to enclosing body
		Can not have access modifiers
		They can be marked as abstract or final
		
		Used by instantiating inside the same body
*/
