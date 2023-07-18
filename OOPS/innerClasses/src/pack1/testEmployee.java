package pack1;

import java.util.ArrayList;

public class testEmployee
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		emp.setFirstName("abc");
		emp.setLastName("xyz");
		
		ArrayList<Jobs> list = new ArrayList();
		list.add(new Jobs("software","manager", 25000));
		list.add(new Jobs("mechanical","lead", 15000));
		list.add(new Jobs("civil","engineer", 30000));
		
		emp.setJobs(list);
		
		System.out.println(emp);
	}
}
