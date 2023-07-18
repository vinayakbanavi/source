/*
 * Third Min from the given array
 */

package pack2_logical;

public class Q34 
{
	public static void main(String[] args)
	{
		int[] nums = {12, 17, 7, 36, 5, 15, 65, 18, 32, 61};
//		second min : 12
		
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i] < firstMin) 
			{
				thirdMin = secondMin;
				secondMin = firstMin;
				firstMin = nums[i];
			} 
			else if (nums[i] < secondMin)
			{
				thirdMin = secondMin;
				secondMin = nums[i];
			}
			else if (nums[i] < thirdMin)
			{
				thirdMin = nums[i];
			}
		}
		
		System.out.println("Third Minimum number from the given Array : " + thirdMin);
	}
}
