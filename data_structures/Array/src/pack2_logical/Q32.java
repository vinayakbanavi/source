/*
 * find Out second max from the given array
 */

package pack2_logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Q32 
{
	public static void main(String[] args) 
	{
		int[] nums = {12, 17, 7, 36, 5, 15, 65, 18, 32, 61};
//		second max : 61
//		Using iterations
		{
			int firstMax = Integer.MIN_VALUE;
			int secondMax = Integer.MIN_VALUE;
			
			for (int i = 0; i < nums.length; i++) 
			{
				if (nums[i] > firstMax)
				{
					secondMax = firstMax;
					firstMax = nums[i];
				}
				else if (nums[i] > secondMax)
				{
					secondMax = nums[i];
				}
				
			}
			System.out.println("Second max : " + secondMax);
			
		}
		
		
//		Using collections
		{
			List<Integer> list = new ArrayList();
			
			for (int i : nums)
			{
				list.add(i);
			}
			
			Collections.sort(list);
			
//			System.out.println("Second max : " + list.get(list.size() - 2));
		}
	}
}
