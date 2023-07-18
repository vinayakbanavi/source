package pack3;

public class AddEmployee
{
	
	public static void main(String[] args) 
	{
		Job j1 = new Job("software", 50000, "vijay");
		Job j2 = new Job("hardware", 40000, "bhanu");
		Job j3 = new Job("sales", 60000, "bharath");
		Job j4 = new Job("admin", 10000, "rupa");

		Job[] jobs = { j1, j2, j3, j4 };

		Employee emp = new Employee("kumar", jobs);
		Job currentJob;
		
		System.out.println("\nfirst read");
		while (emp.hasNext())
		{
			currentJob = emp.nextJob();
			System.out.println(currentJob.title + ", " + currentJob.salary + ", " + currentJob.manager);
		}
		
		System.out.println("\nsecond read");
		while (emp.hasNext())
		{
			currentJob = emp.nextJob();
			System.out.println(currentJob.title + ", " + currentJob.salary + ", " + currentJob.manager);
		}
		
		System.out.println("\nthird read");
		while (emp.hasNext())
		{
			currentJob = emp.nextJob();
			System.out.println(currentJob.title + ", " + currentJob.salary + ", " + currentJob.manager);
		}
	}
}
