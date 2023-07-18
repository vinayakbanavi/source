package pack1;

public class M2 
{
	public static void main(String[] args) 
	{
		int i = 100;
		long j = i;
		float f = j;
		double d = f;
		
		d = i;
		d = j;
		d = f;
		System.out.println("done");
	}
}
