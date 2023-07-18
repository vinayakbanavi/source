package pack7;

public class M9 
{
	public static void main(String[] args) 
	{
		class A 
		{
			static int i;
			
			static void test() 
			{
			}
			
			private void test2() 
			{
			}
		}
	}
}
// 1.Outer classes always can be only be public or default. 
//even outer class can not be static. the class acting as member to java file that is outer class.
//2. inner class can be with any access level. 
//but local inner class should not take any access level.no access level for local members. 
//but member of local inner class can have any access level. 4th type of inner class is anonymous inner class.