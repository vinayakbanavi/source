package pack1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

// Autowiring in xml
public class M7
{
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Customer obj = context.getBean("c2", Customer.class);
		System.out.println(obj.getFirstName());
		System.out.println(obj.getLastName());
		
		Address address = obj.getAddress();
		System.out.println(address.getHouseNo());
		System.out.println(address.getStreetName());
	}
}
