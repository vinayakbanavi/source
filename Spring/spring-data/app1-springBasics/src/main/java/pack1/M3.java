package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M3 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student s1 = context.getBean("s1", Student.class);
		Student s2 = context.getBean("s1", Student.class);
		Student s3 = context.getBean("s1", Student.class);
		Student s4 = context.getBean("s1", Student.class);
		
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
	}
}
