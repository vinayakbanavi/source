/*
 	Loggers : are the records of information, error or warnings
 	
 	In the following test case we are using print() method to check what's happening in the execution
 	
 	But using print() in the application development is not a good practice
 	
 	By using System.out.print()
 	1. prints the specified content in the console.
 	   Developer gets to understand what's happening in the flow
 	   Only available once after the execution
 	   Can not store this flow into the file by default
 	   
 	1. SOP needs console to display message, SOP not able to send this log into files/database
 	
 	2. SOP contains Synchronized block to display the data, 
 	   Which is time consuming, expensive, heavyWeight
 	   
 	3. Too many SOP will reduce performance
 	
 	4. SOP will be available in Developer console only not to the User of the application
 	
 	To over come above drawbacks we use loggers
 	
 	Logging Frameworks:
 	1. java.util.Logging    (built in)
 	2. Log4j 
 		Reliable, fast and flexible framework written in java.
 		
 		Features : 
 		- not synchronized (Allow multiThreading)
 		- optimized to improve application process
 		- environment to send log messages to  more than one output appenders
 		- multiple levels to generate messages 
 		--> ALL << TRACE << DEBUG << INFO << WARN << ERROR << FATAL
 		
 	3. LogBack
 	4. Commons Logging
 	
 	Advantages :
 	1. Quick Debugging
 	2. Problem diagnosis
 	3. Easy Maintenance
 	
 	DisAdvantages :
 	1. Extra Code
 	
 	
 */

package pack1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator 
{
	Calculator calcy = new Calculator();

	@Test
	public void testSum()
	{
		System.out.println("Testing Calculator sum functionality");
		
		System.out.println("Calling calcy.sum()");
		int sum = calcy.sum(5, 12);

		System.out.println("checking sum functionlity by asserEquals(expected, actual)");
		assertEquals(130, sum);
		
		System.out.println("sum functionality working as per the requirement");
	}
}
