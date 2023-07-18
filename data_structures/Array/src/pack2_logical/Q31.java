/*
 * max odd number from the given array
 */

package pack2_logical;

public class Q31 
{
	public static void main(String[] args) 
	{
		int[] nums = {12, 17, 7, 36, 5, 15, 65, 18, 32, 61};
//		from observation max odd no = 65
		
		
		int oddMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i]%2 != 0 && oddMax < nums[i])
			{
				oddMax = nums[i];
			}
		}
		
		System.out.println("maximum odd number in the given array : " + oddMax);
	}
}
