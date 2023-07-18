package pack4;


public class Employee {
	String name;
	Job[] jobs;
	
	Employee(String name, Job[] jobs)
	{
		this.name = name;
		this.jobs = jobs;
	}

	JobIterator getJobIterator()
	{
		return new JobIterator(jobs);
	}
}

class JobIterator
{
	private int location;
	Job[] jobs;
	JobIterator(Job[] jobs)
	{
		this.jobs = jobs;
	}
	
	boolean hasNext()
	{
		return location < jobs.length;
	}
	
	Job next()
	{
		return jobs[location++];
	}
}