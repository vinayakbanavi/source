package pack1;

public class A1 
{
	public static void main(String[] args) 
	{
//		loop1: task1
		for (int i = 0; i < 1000; i++) 
		{
			System.out.println("for loop1 : " + i);
		}

//		loop2: task2
		for (int i = 4000; i < 5000; i++) 
		{
			System.out.println("for loop1 : " + i);
		}
	}
}

/*
 	Normal Execution : 
 		from top to bottom 
 		loop2 starts only after complete execution of loop1.
 		
 		tasks are getting done sequentially 
 		
 		Java command internally creating one thread ( main )
 		
*/