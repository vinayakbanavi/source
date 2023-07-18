package pack1_basics;

public class A2 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println("For loop : " + i);
			/*
			 * with breakpoint at 9 we can click resume.
			 * resume will cover one iteration from breakpoint to breakpoint.
			 * we add conditions to the breakpoint so that we can skip to specific point in code. 
			 * right click on breakpoint > Breakpoint properties > conditional 
			 * provide the boolean condition (i == 5) 
			 * executes until the condition satisfies 
			 * so the breakpoint will check for i every time and stops when condition becomes true
			 */
		}
	}
}
