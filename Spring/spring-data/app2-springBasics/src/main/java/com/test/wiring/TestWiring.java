package com.test.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestWiring 
{
	public static void main(String[] args) 
	{

/*
//		Explicit wiring using ref
		{
			ApplicationContext container = new ClassPathXmlApplicationContext("mapping.xml");
			
			Page obj = container.getBean("p1", Page.class);
			System.out.println("Book title : " +obj.getBook().getTitle());
			System.out.println("Book author : " + obj.getBook().getAuthor());
			System.out.println(obj.getHeader());
			System.out.println(obj.getBody());
			System.out.println(obj.getFooter());
		}
*/

/*
//		Autowire= bytype
		{
			ApplicationContext container = new ClassPathXmlApplicationContext("mapping.xml");
			
			Page obj = container.getBean("p2", Page.class);
			System.out.println("Book title : " +obj.getBook().getTitle());
			System.out.println("Book author : " + obj.getBook().getAuthor());
			System.out.println(obj.getHeader());
			System.out.println(obj.getBody());
			System.out.println(obj.getFooter());
		}
*/


//		Autowire = byName
		{
			ApplicationContext container = new ClassPathXmlApplicationContext("mapping.xml");
			
			Page obj = container.getBean("p3", Page.class);
			System.out.println("Book title : " +obj.getBook().getTitle());
			System.out.println("Book author : " + obj.getBook().getAuthor());
			System.out.println(obj.getHeader());
			System.out.println(obj.getBody());
			System.out.println(obj.getFooter());
			
		}

//		Autowire = constructor (similar to byType , but type applies to constructor arguments)
//		Autowire = autodetect (Spring will try to wire through constructor if fails than with byType)

	}
}
