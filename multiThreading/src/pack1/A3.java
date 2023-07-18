package pack1;

class Task1 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 1; i < 1000; i++) 
		{
			System.out.println("Task1 : " + i);
		}
	}
}

class Task2 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 2000; i < 3000; i++) 
		{
			System.out.println("Task2 : " + i);
		}
	}	
}

class Task3 extends Thread
{
	@Override
	public void run() 
	{
		for (int i = 5000; i < 6000; i++) 
		{
			System.out.println("Task3 : " + i);
		}
	}	
	
}

public class A3 
{
//	Executing by the default main Thread
	public static void main(String[] args) 
	{
//		Each Object represents Child Threads
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		Task3 t3 = new Task3();
		
		t1.start();
		t2.start();
		t3.start();
		
//		Main Thread Task
		for (int i = 10000; i < 11000; i++) 
		{
			System.out.println("Main : " + i);
		}	
	}
}
