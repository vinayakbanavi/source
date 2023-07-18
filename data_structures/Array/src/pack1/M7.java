// Minimum number from a given Array

package pack1;

public class M7
{
	public static void main(String[] args) 
	{
		int[] a1 = {10, 200, 30, 400, 4, 50, 800, 20, 80, 5, 1, -3, 8, 230, 900, 45};
	         //      0    1   2    3   4  5    6    7  8   9  10  11 12  13  14 , 15
		
		int min = a1[0];
		
		for (int i = 0; i < a1.length; i++) 
		{
			if (a1[i] < min)
			{
				min = a1[i];
			}
		}
		
		System.out.println("minimum number in the the given array : " + min);
	}
}
