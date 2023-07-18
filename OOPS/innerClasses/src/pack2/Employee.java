package pack2;


public class Employee {
	String name;
	Job[] jobs;
	private int location;
	
	Employee(String name, Job[] jobs)
	{
		this.name = name;
		this.jobs = jobs;
	}
	
	boolean hasNext()
	{
		return location < jobs.length;
	}
	
	Job nextJob()
	{
		return jobs[location++];
	}
}
