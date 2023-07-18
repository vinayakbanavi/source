package pack1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class A1
{
/*
 *  All the Annotated methods must have void type
 *  Executes before each test case
 */
	@Before
	public void beforeMethod()
	{
		System.out.println("Executes before test case");
	}
	
/*
 *  Return type of test method is void
 *  cannot return any value
 *  Because there is no need to return any value
 */
	@Test
	public void testMethod1()
	{
		System.out.println("Executing Junit Test cases");
	}
	
/*
 *  All the Annotated methods must have void type
 *  Executes After each test case
 */
	@After
	public void afterMethod()
	{
		System.out.println("Executes after test case");
	}
}
