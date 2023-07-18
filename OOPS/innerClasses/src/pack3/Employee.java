package pack3;


public class Employee {
	String name;
	Job[] jobs;
	private int location;
	private int read;
	
	Employee(String name, Job[] jobs)
	{
		this.name = name;
		this.jobs = jobs;
	}
	
	boolean hasNext()
	{	
		
//		any number of times
		
/*
 	if(location == jobs.length)
 	{
 		location = 0;
 		return false;
 	}
 	
 	return true;
 */
		
		
		boolean check = location < jobs.length;
		
		if (check)
		{
			return check;
		}
		else if(++read < 2)
		{
			location = 0;
		}
		
		return false;
	}
	
	Job nextJob()
	{
		return jobs[location++];
	}
	
}
