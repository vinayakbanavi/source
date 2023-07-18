// Second maximum number from the given Array

package pack1;

public class M10 
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 200, 30, 400, 4, 50, 800, 20, 80, 5, 1, -3, 8, 230, 900, 45};
	         //      0    1   2    3   4  5    6    7  8   9  10  11 12  13  14 , 15
		
		
//		sort the given array
		
		for (int i = 0; i < a1.length - 1; i++)
		{
			for (int j = i + 1; j < a1.length; j++)
			{
				if (a1[i] < a1[j])
				{
					int temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}
			}
		}
		
		System.out.println("maximum number in the the given array : " + a1[0]);
		System.out.println("Second maximum number in the the given array : " + a1[1]);
	}

}
