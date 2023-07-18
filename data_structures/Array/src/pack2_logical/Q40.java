// print the  odd elements which are in the middle of two even elements

package pack2_logical;

public class Q40 
{
	public static void main(String[] args) 
	{
		int[] nums = {8, 5, 5, 7, 2, 4 , 6, 1, 6, 3};
		
		for(int i = 1; i < nums.length -1 ; i++)
		{
			if (nums[i] %2 != 0 && nums[i - 1]%2 == 0 && nums[i + 1] %2 == 0 )
			{
				System.out.print(nums[i] + " ");
			}
		}
	}
}
