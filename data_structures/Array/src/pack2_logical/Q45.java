// print out all the two elements whose sum is zero
// find out all the three elements whose sum is zero
// find out the nearest digit to the current element in the given array ( 5 --> 3 or 4)
package pack2_logical;

public class Q45
{
	public static void main(String[] args) 
	{
		int[] nums = {-6, -4, 2, 3, -1, 2, -3, 6, 1, -1, 4};
		
		for (int i = 0; i < nums.length; i++)
		{
			for (int j = i + 1; j < nums.length ; j++)
			{
				if(nums[i] + nums[j] == 0)
				{
					System.out.println(nums[i] + ", " + nums[j]);
				}
			}
		}
	}
}
