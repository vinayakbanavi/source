package pack2;

public class ArraySorter 
{
	public static int[] sortArray(int[] nums) 
	{
//		bubble sort
		// 7 4 6 2
		
		for (int i = 0; i < nums.length - 1 ; i++)
		{
			for (int j = i + 1 ; j < nums.length ; j++)
			{
				if (nums[i] > nums[j])
				{
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		return nums;
	}
}
