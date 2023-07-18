package pack4;

import java.io.Closeable;

class A implements Closeable
{
	public void close()
	{
		System.out.println("from close");
	}
}

class E6
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		try(A a1 = new A(); A a2 = new A(); A a3 = new A())
		{
			System.out.println("try begin");
			System.out.println("try end");
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
