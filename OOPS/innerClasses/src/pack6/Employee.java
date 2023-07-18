package pack6;

// Outer class
public class Employee 
{
//	inner class
//	is necessary to achieve encapsulation
	
	class JobIterator
	{
	//	remain same for whole execution
		private static int location;
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
	
	String name;
	Job[] jobs;
	private JobIterator it ;
	private int read;
	
	Employee(String name, Job[] jobs)
	{
		this.name = name;
		this.jobs = jobs;
	}

	JobIterator getJobIterator()
	{
		/*
		 * if (read == 0) { read++; it = new JobIterator(jobs); }
		 * 
		 * return it;
		 */
		
		return new JobIterator(jobs);
	}
}
