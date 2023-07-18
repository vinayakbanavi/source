/*
 * 2nd min number from the given array
 */

package pack2_logical;

public class Q33 
{
	public static void main(String[] args) 
	{
		int[] nums = {12, 17, 7, 36, 5, 15, 65, 18, 32, 61};
//		second min : 7
		
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++) 
		{
			if (nums[i] < firstMin)
			{
				secondMin = firstMin;
				firstMin = nums[i];
			}
			else if (nums[i] < secondMin)
			{
				secondMin = nums[i];
			}
		}
		
		System.out.println("second min : " + secondMin);
	}
}
