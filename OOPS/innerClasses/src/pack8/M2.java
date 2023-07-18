// Anonymous Inner class
package pack8;

public class M2 
{
	public static void main(String[] args) 
	{
		A a1 = new A() 
		{
			
			
			void test1()
			{
				System.out.println("from AIC class test1");
			}
		};
		a1.test1();
		a1.test2();
	}
}
// object is not creating class A. 
//this is one class design this class doesn't have a name. it is class without a name. it is anonymous inner class.
// new operator kept to anonymous inner class it is subclass to A. 
//it will design the class without name and inherits the class A. without super class we can not develop anonymous class.
//it should be subclass to one of the existing class. 
//new operator not apply to class A. it apply to subclass which is anonymous.
//we are mentioning super class name and which constructor of super it has to use. it should ends with ;
