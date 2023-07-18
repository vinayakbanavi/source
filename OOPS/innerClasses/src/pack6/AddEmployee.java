package pack6;

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
		Employee.JobIterator it = emp.getJobIterator();
//		Employee.JobIterator it = (emp).new JobIterator(jobs);
		
		System.out.println("\nfirst read");
		while (it.hasNext())
		{
			currentJob = it.next();
			System.out.println(currentJob.title + ", " + currentJob.salary + ", " + currentJob.manager);
		}
		
		System.out.println("\nsecond read");
		while (it.hasNext())
		{
			currentJob = it.next();
			System.out.println(currentJob.title + ", " + currentJob.salary + ", " + currentJob.manager);
		}
		
		it = emp.getJobIterator();
		System.out.println("\nsecond read with new getJobIterator()");
		while (it.hasNext())
		{
			currentJob = it.next();
			System.out.println(currentJob.title + ", " + currentJob.salary + ", " + currentJob.manager);
		}

	}
}
