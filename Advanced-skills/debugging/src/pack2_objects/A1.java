/*
 	Right side display :
 	
 	variables  
 	: Represents all the available variables above the current statement with their corresponding values 
 	: Gets updated with the flow of execution
 	
 	BreakPoints 
 	: list of breakpoints in the code
 	: We can temporarily disable the breakpoints in this section
 	: ctrl + alt + b skip all the exiting breakpoints
 	
 	Expressions
 	: any statement ("p2.getFirstName")
 	: keep track of the value of the expression in the current statement
 	: We can carry out calculation when needed over here
 	
 	
 	during the execution 
 	hovering over the variable will pop the current value/ object
 	
 	we can select the specific statement/Expression and inspect will give the values
 */

package pack2_objects;

public class A1
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Vinayak", "Banavi");
		p1.setAge(26);
		p1.setSex("Male");
		
		Person p2 = new Person("Pratham", "C");
		p2.setAge(22);
		p2.setSex("Male");
		
		Person[] persons = {p1, p2};
		
		for (Person p : persons)
		{
			System.out.println("FirstName : " + p.getFirstName());
			System.out.println("LastName : " + p.getLastName());
			System.out.println("age : " + p.getAge());
			System.out.println("sex : " + p.getSex());
			
			System.out.println();
		}
	}
}
