/*
 * min odd number from the given array
 */

package pack2_logical;

public class Q30 
{
	public static void main(String[] args) 
	{
		int[] nums = {12, 17, 7, 36, 5, 15, 65, 18, 32, 61};
//		from observation min odd no = 7
		
		
		int oddMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i]%2 != 0 && oddMin > nums[i])
			{
				oddMin = nums[i];
			}
		}
		
		System.out.println("minimum odd number in the given array : " + oddMin);
	}
}
