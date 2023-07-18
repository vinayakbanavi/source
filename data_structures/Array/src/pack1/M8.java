// maximum number from a given array

package pack1;

public class M8 
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 200, 30, 400, 4, 50, 800, 20, 80, 5, 1, -3, 8, 230, 900, 45};
	         //      0    1   2    3   4  5    6    7  8   9  10  11 12  13  14 , 15
		
		int max = a1[0];
		
		for (int i = 0; i < a1.length; i++) 
		{
			if (a1[i] > max)
			{
				max = a1[i];
			}
		}
		System.out.println("maximum number in the the given array : " + max);
	}
}
