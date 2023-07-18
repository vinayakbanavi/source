package pack1;

public class Jobs
{
	String title;
	String role;
	int salary;
	
	Jobs(String title, String role, int salary)
	{
		this.title = title;
		this.salary = salary;
		this.role = role;
	}
	
	public String toString()
	{
		return "(" + title+ ", " + role + ", " + salary + ")";
	}
}
