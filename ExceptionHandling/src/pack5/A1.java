package pack5;

import java.io.Closeable;

class A implements Closeable
{
// only one method in Closeable (functional interface)
	public void close()
	{
		System.out.println("from close");
	}
}

class A1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

//      try can have paranthesis 
//      it can have any number of closeable resources seperated by ;
//      these resources are local to the try block

		try(A a1 = new A(); A a2 = new A(); A a3 = new A())
		{
			System.out.println("try begin");
			System.out.println("try end");

//		All the resources final, cannot re assign
//		auto-closeable resource a1 may not be assigned
//			a1 = null;
//			a1 = a2;
 
//		Auto resource close
//		Closeable resources are closing automatically by the framework before finally
//			a1.close();
//			a2.close();
//			a3.close();
		}
		catch (Exception ex)
		{
			System.out.println("from catch : " + ex);
		}
		finally
		{
			System.out.println("from finally");
		}
		System.out.println("main end");
	}
}
