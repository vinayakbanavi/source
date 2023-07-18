package pack1;

import java.util.Iterator;

public class A5
{
//	Inner class
	static class Task1 extends Thread
	{
		@Override
		public void run() 
		{
			for (int i = 1; i < 1000; i++) 
			{
				System.out.println("Task : " + i);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Task1 t1 = new Task1();
		t1.start();
		
		for (int i = 5000; i < 6000; i++) 
		{
			System.out.println("Main : " + i);
		}
	
	}
}
