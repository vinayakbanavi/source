package pack1;

class B extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 1; i < 1000 ; i++)
		{
			System.out.println("Task : " + i);
		}
	}
}

public class A4 
{
	public static void main(String[] args) 
	{
//		Same Task can have multiple Threads
		
		B b1 = new B();
		b1.start();
		
		B b2 = new B();
		b2.start();
		
		B b3 = new B();
		b3.start();
				
		for (int i = 5000; i < 6000; i++) 
		{
			System.out.println("Main : " + i);
		}
	}
}
