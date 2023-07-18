package pack2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class UnitTest
{
	int[] nums;
	
	@Before
	public void before()
	{
		nums = new int[]{7, -4, 6, -2,};
	}
	
	@Test
	@Ignore
	public void test1()
	{
		ArraySorter.sortArray(nums);
		
		int[] sorted = {-4, -2, 6, 7};
		
		assertArrayEquals(nums, sorted);
		System.out.println("implementation successful");
	}
	
/*
 * 	negative test case
 * 	if user gives some other input or something else than allowed
 *  we can check whether it is throwing expected exception or not
 */
	
	@Test(expected = NullPointerException.class)
	@Ignore
	public void test2()
	{
		String number = null;
		int i = StringToNumber.convert(number);
		assertEquals(i, 3486);
		System.out.println("from negative test case");
	}
	
	
	/*
	 * 	timeout
	 *  we can set timeout for runtime execution 
	 *  test cast must execute within the given time
	 */
	
	@Test(timeout = /*miliseconds*/ 2)
	public void test3()
	{
		/* calling a method */
	}
}
