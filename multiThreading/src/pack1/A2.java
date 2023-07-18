package pack1;

// Thread is a inbuilt class
class A extends Thread
{
//	Overriding run()
	public void run() 
	{
//		Task1
		for (int i = 0; i < 1000; i++) 
		{
			System.out.println("Task1 : " + i);
		}
	}
}

public class A2 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.start();
//		a1.run(); no multiThreading
		
//		Task2
		for (int i = 4000; i < 5000; i++) 
		{
			System.out.println("Task2 : " + i);
		}
	}
}


/*
 	Each Task can be designed through a class Extending Thread
 	These tasks can be implemented inside run() method.
 	Each object to thread class represents each independent thread.
 	
 	By default main method will be executing by Main thread
 	child thread will be creating and Executing inside Main method (Execution will be simultaneous with main thread)
*/