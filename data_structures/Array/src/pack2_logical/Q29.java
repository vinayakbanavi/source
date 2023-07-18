/*
 * Min even number from the given array
 */


package pack2_logical;

public class Q29 
{
	public static void main(String[] args) 
	{
		int[] nums = {12, 17, 7, 36, 5, 15, 65, 18, 32, 61};
//		from observation max even no = 36
		
		
		int evenMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length; i++)
		{
			if(nums[i]%2 == 0 && evenMin > nums[i])
			{
				evenMin = nums[i];
			}
		}
		
		System.out.println("minimum even number in the given array : " + evenMin);
	}
}
