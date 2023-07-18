package pack1;

public class M1
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 200, 30, 400, 4, 50, 800, 20, 80, 5};
		//          0    1   2    3   4  5    6    7  8   9
//		for (int i = 3; i <= 8; i++) 
//		{
//			System.out.println(a1[i]);
//		}
		
//		for (int i = 6; i >= 2; i--) 
//		{
//			System.out.println(a1[i]);
//		}
		
		for (int i = 2; i <= 8; i += 2) 
		{
			System.out.println(a1[i]);
		}
	}

}
