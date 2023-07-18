package pack4;

import java.io.*;

class A6
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("");
			Thread.sleep(100);
			new FileWriter("");	
		}
		catch (ClassNotFoundException ex)
		{
			System.out.println("from catch1");
		
		}
		catch (IOException ex)
		{
			System.out.println("from catch2");
		}
		catch(InterruptedException ex)
		{
			System.out.println("from catch3");
		}
	}
}