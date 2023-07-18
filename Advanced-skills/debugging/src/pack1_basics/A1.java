/*
		Debugging : Is the process of locating and removing bugs, errors or abnormalities from the program
				  : bugs/ errors will not be visible by looking at the code normally
				  : bugs will get triggered when specific condition occurs
				  
		How to debug?
				  : Many IDE will be providing tools to debug
				  
				  1. switch to debug mode/ add a breakpoints and click the debug
				  2. breakpoints : It is a signal that tells the debugger to temporarily suspend execution at certain point of code
 */

package pack1_basics;

public class A1 
{
	public static void main(String[] args) 
	{
		/*
		 * Add breakpoint at line 27 of the code and click debug.
		 * we will get to see the variables in the scope of breakpoint(above the breakpoint).
		 * breakpoint having the scope limited to current method.
		 * 
		 * tools : 
		 * terminate : terminates the current debugging execution
		 * stepOver  : will move to the next statement in the code
		 * 			 : will not go deeper into the code, if current statement is calling any method
		 * 
		 * stepInto : will go one step deeper into the program, go into the method if any.
		 * 
		 * we can also add two breakpoints proceeded by resume
		 * it will carry out the execution from first to second breakpoint
		 * 
		 * Debug menu : 
		 * will show the stack entries.
		 */
		
		int firstVariable = 1;
		int secondVariable = 1;
		
		int sum = sum(firstVariable , secondVariable);
		
		System.out.println("sum : " + sum);
	}
	
	public static int sum(int i , int j)
	{
		if (i == 5)
		{
			return i + j;
		}
		
		return sum (i+1, j+1);
	}
}
