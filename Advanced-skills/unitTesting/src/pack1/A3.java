// @Ignore

package pack1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class A3 
{
	@BeforeClass
	public static void init()
	{
		System.out.println("Executes before all tests");
	}
	
	@AfterClass
	public static void exit()
	{
		System.out.println("Executes after all tests");
	}
/*
 *  @Ignore is only available for test
 *  if we annotate other methods no changes will be seen
 */
	@Before
	public void preTest()
	{
		System.out.println("Before test");
	}
	
	@After
	public void  postTest()
	{
		System.out.println("After test");
	}
	
/*
 *  @Ignore skips/ignores the Annotated test
 */
	@Test
	@Ignore
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
}
