package pack1;

public class A8 
{
	public static void main(String[] args) 
	{
//		MultiThreading with Anonymous Inner Class
		
		new Thread() 
		{
			@Override
			public void run() 
			{
				for (int i = 1; i < 1000; i++) 
				{
					System.out.println("Anonymous : " + i);
				}
			}
		}.start();
	
		
		for (int i = 5000; i < 6000; i++) 
		{
			System.out.println("Main : " + i);
		}
	}
}
