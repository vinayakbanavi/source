package com.test.propertyDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson 
{
	public static void main(String[] args) 
	{
//		Early/ Eager instantiation (hardCoding)
/*
 * 		{ 
 * 			System.out.println("TightCoupling : Hardcoding Instantiation"); 
 * 			Person p1 =new Person();
 * 
 * 			System.out.println("Person Object : " + p1);
 * 			System.out.println(p1.getFirstName()); 
 * 			System.out.println(p1.getLastName());
 * }
 */
		
/*
 *		Dependency Injection : 
 *		main functionality provided by the IOC.
 * 		spring-core module is responsible for injecting dependencies through constructor or property(setters)
 * 		IOC emphasizes on Independent class (loose Coupling)
 * 		Container frees them from Object Creation and maintenance
 * 		Classes Managed by bean must follow the condition of java bean
 * 
 * 		Types of Dependency Injections
 * 		1. constructor
 * 		2. property
 * 		3. method
 */
		{
			System.out.println("property injection");			
			ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("personConfig.xml");
/*
 * 			We are not instantiating Person class 
 * 			container will be created by applying the metadata
 * 			container will look for bean in metadata and instantiate those beans
 * 			DI will be done internally and the object will be ready to use
 * 			Instead we are asking the IOC to get the object
 */
			Person p1 = container.getBean("p1", Person.class);

			System.out.println("\nusing the object");
			System.out.println(p1.getFirstName());
			System.out.println(p1.getLastName());
		}
		
	}
}
