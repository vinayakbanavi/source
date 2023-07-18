package pack8;
public class M4
{
	public static void main(String[] args) 
	{
		A a1 = new A() 
		{	
			void test1()
			{
				System.out.println("from inner class test1");
			}
			
			void test2()
			{
				System.out.println("from inner class test2");
			}
		};
		a1.test1();
		a1.test2();
	}
}
/* 
1. We can not develop without existing class or interfaces while developing anonymous inner class we have to mention
existing class or interface. We made anonymous inner class by making subclass of A. Class A contain two method.
There is no extends but anonymous inner class is subclass to A.
For anonymous inner class we can't create more than one object for anonymous inner class. 
 because it doesn't have a name.
2. Designing a class and creating object with in single statement.
Anonymous inner class is only instant usage. or one time uses. Here a1 is object of anonymous inner class.
3. I want to use class member but some different implementation for instance/in line/one time usage.
this only for one object
 */
