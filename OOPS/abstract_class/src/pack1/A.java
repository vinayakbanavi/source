package pack1;

public abstract class A {
	
	void test1()
	{
		System.out.println("from test1");
	}
	void test2()
	{
		
	}
	abstract void test3();
}
/*
abstract - future scope,incomplete, yet to implement

if class containing abstract method than the class must be declared abstract
order can be
1. public abstract class A
2. abstract public class A

if class is an abstract :
object can't be created in the same class\
but Abstract class can have a reference variable
we can chose abstract class as a data type
*/
