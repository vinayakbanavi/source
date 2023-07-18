package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class M8 
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Author a1 = context.getBean("author", Author.class);
		
		System.out.println(a1.getFirstName());
		System.out.println(a1.getLastName());
		
		Address address = a1.getAddress();
		System.out.println(address.getHouseNo());
		System.out.println(address.getStreetName());
	}
}
