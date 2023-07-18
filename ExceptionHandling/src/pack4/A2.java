package pack4;

class A2 
{
//  Same method can throw any number of Exception
	public static void main(String[] args)  throws ClassNotFoundException, InterruptedException
	{
		Class.forName("");
		Thread.sleep(100);
	}
}
