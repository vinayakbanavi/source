package pack1;

public class M2 
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 200, 30, 400, 4, 50, 800, 20, 80, 5, 1, -3, 8, 230, 900};
		//          0    1   2    3   4  5    6    7  8   9  10  11 12  13  14
		
//		for (int i = a1.length - 1; i >= 0 ; i--) 
//		{
//			System.out.print(a1[i] + ", ");
//		} 
		
		for (int i = a1.length - 1; i >= 0 ; i -= 2) 
		{
			System.out.print(a1[i] + ", ");
		}
	}
}
