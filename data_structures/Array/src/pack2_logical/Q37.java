//Print the elements which are next to even elements

package pack2_logical;

import java.util.Iterator;

public class Q37
{
	public static void main(String[] args) 
	{
		int[] nums = {1, 8, 5, 6, 6, 7, 9, 10, 2, 4, 3};
		
		for (int i = 1; i < nums.length - 1; i++) 
		{
			if (nums[i - 1] %2 == 0)
			{
				System.out.print(nums[i] + " ");
			}
		}
	}
}
