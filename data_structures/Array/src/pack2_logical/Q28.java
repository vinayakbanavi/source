/*
 * Max value among even elements in the given array
 */

package pack2_logical;

public class Q28 
{
	public static void main(String[] args) 
	{
		int[] nums = {12, 17, 7, 36, 5, 15, 65, 18, 32, 61};
//		from observation max even no = 36
		
		
		int evenMax = Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i]%2 == 0 && evenMax < nums[i])
			{
				evenMax = nums[i];
			}
		}
		
		System.out.println("maximum even number in the given array : " + evenMax);
	}
}
