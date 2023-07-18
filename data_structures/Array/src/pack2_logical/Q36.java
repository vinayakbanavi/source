/*
 * Print the consecutive continues numbers in asc/desc order
 */

package pack2_logical;

public class Q36
{
	public static void main(String[] args)
	{
		int[] nums = {7, 10, 12, 11, 23, 51, 7, 36, 54, 5, 1, 65, 81, 97, 61};

		 boolean asc = true;
		 boolean desc = false;
		
		System.out.print(nums.length != 0 ? nums[0] + ", ": 0);
		
		for (int i = 1; i < nums.length; i++) 
		{
			if(asc && nums[i - 1] < nums[i])
			{
				System.out.print(nums[i] + ", ");
			}
			else if(!desc)
			{
				System.out.println();
				asc = false;
				desc = true;
			}
			
			if (desc && nums[i] < nums[i -1])
			{
				System.out.print(nums[i] + ", ");
			}
			
			else if (!asc)
			{
				System.out.println();
				System.out.print(nums[i] + ", ");
				asc = true;
				desc = false;
			}
			
		}
	}
}
