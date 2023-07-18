/*
 * Third Maximum from the given array
 */

package pack2_logical;

public class Q35 
{
	public static void main(String[] args)
	{
		int[] nums = {12, 17, 7, 36, 5, 15, 65, 18, 32, 61};
//		second min : 36
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i] > firstMax) 
			{
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = nums[i];
			} 
			else if (nums[i] > secondMax)
			{
				thirdMax = secondMax;
				secondMax = nums[i];
			}
			else if (nums[i] > thirdMax)
			{
				thirdMax = nums[i];
			}
		}
		
		System.out.println("Third Maximum number from the given Array : " + thirdMax);
	}
}
