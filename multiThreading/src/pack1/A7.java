package pack1;

public class A7 
{
	public static void main(String[] args) 
	{
//		Anonymous Inner class
		Thread t1 = new Thread() 
		{
			@Override
			public void run() 
			{
				for (int i = 1; i < 1000; i++) 
				{
					System.out.println("Anonymous : " + i);
				}
			}
		};
		
		t1.start();
		
		for (int i = 5000; i < 6000; i++) 
		{
			System.out.println("Main : " + i);
		}
	}
}
