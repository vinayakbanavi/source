// print the two consecutive odd numbers

package pack2_logical;

public class Q43
{
	public static void main(String[] args) 
	{
		int[] nums = {8, 5, 5, 7, 2, 4 , 6, 1, 6, 3};
		
		for(int i = 0; i < nums.length -1 ; i++)
		{
			if (nums[i] %2 != 0 && nums[i + 1]%2 != 0 )
			{
				System.out.print(nums[i] + " " + nums[i + 1] + " ");
				i++;
			}
			else if(i != 0 && nums[i] % 2 != 0 && nums[i - 1]%2 != 0)
			{
				System.out.print(nums[i] + " ");
			}
		}
	}
}
