// print the three element such that the third element is the sum of first two elements

package pack2_logical;

public class Q44
{
	public static void main(String[] args) 
	{
		int[] nums = {8, 5, 5, 7, 2, 4 , 6, 1, 6, 3};
		
		for(int i = 2; i < nums.length ; i++)
		{
			if (nums[i] == (nums[i - 2] + nums[i -1]))
			{
				System.out.println(nums[i - 2] + ", " + nums[i - 1] + ", " + nums[i]);
			}
		}
	}
}
