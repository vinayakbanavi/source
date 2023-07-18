package pack1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class A2 
{
/*
 *  We can not declare other than Test for multiple members
 *  It will create ambiguity
 *  
 *  @BeforeClass and @AfterClass method must be static
 *  They will execute only once for each execution
 */
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
 *  There can be any number of test cases 
 *  For every case @Before and @After will get execute
 */
	@Test
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
