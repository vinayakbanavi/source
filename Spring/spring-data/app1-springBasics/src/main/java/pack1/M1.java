package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M1 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
//		if multiple Person objects were present, we can access specific object through id.
		Person obj = context.getBean("p1", Person.class);
//		Person obj = (Person) context.getBean("p1");
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
	}
}
