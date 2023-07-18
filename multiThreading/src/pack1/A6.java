// Implementing MultiThreading through Local inner class

package pack1;

public class A6
{
	public static void main(String[] args) 
	{
		class A extends Thread
		{
			@Override
			public void run() 
			{
				for (int i = 1; i < 1000; i++) 
				{
					System.out.println("Local : " + i);
				}
			}
		}
		
		A a1 = new A();
		a1.start();
		
		
		for (int i = 5000; i < 6000; i++) 
		{
			System.out.println("Main : " + i);
		}
	}
}
