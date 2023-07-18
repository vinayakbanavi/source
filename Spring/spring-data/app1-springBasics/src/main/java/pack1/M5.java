package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M5 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student s1 = context.getBean("s1", Student.class);
		
		System.out.println("obj is ready");
		System.out.println(s1.getFirstName());
		System.out.println(s1.getLastName());
		
//		object can be removed permanently from the IoC container after the usage
//		while evacuation registerShutdownHook() will call destroy-method internally
//		
		context.registerShutdownHook();

		System.out.println("done");
	}
}


//		object creation/ data injection / init method(any method)/ object is ready for use/ 