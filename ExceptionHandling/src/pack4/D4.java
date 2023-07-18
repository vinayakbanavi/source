package pack4;

import java.io.*;

class A
{
	void test1() throws NullPointerException
	{
	}

	void test2() throws ClassNotFoundException
	{
	}

	void test3() throws InterruptedException
	{
	}

	void test4() throws Exception
	{
	}

	void test5()
	{
	}
}

class D4 extends A
{

/*
	pack4\D4.java:28: error: test2() in D4 cannot override test2() in A
        void test2() throws InterruptedException
             ^
	 overridden method does not throw InterruptedException

	void test2() throws InterruptedException
	{
		System.out.println("overrided test2() throws ClassNotFoundException");
	}
*/

//  if superclass method throws checked Exception
//  Overriden method can be
//		1. no throw
//		2. throw unchecked
//      3. throw same Exception as Super class method throwing/ subclass Exception
	void test3() throws InterruptedException
	{
		System.out.println("overrided test2()");
	}

//  IOException is subclass to Exception
	void test4() throws IOException
	{
	}

/*
		pack4\D4.java:58: error: test5() in D4 cannot override test5() in A
        void test5() throws ClassNotFoundException
             ^
		overridden method does not throw ClassNotFoundException
		

	void test5() throws ClassNotFoundException
	{
	}
*/
}