package com.test.beanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent 
{
	public static void main(String[] args) 
	{
//		scope : singleton
		{
/*
 * 			Creating the Spring Container
 * 			default scope of bean is singleton
 * 			Spring Container creates only one instance of the bean and cached in memory 
 * 			All the request for bean will get a same reference of the existing bean
 
 * 			bean element with id = s1 
 * 			not mentioned any scope, by default it will be singleton
 */

		
/*
  			ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("studentConfig.xml"); 
            Student obj1 = container.getBean("s1", Student.class); 
            Student obj2 = container.getBean("s1", Student.class); 
            Student obj3 = container.getBean("s1", Student.class); 
            Student obj4 = container.getBean("s1", Student.class);
  
  			System.out.println(obj1 == obj2); 
            System.out.println(obj1 == obj3);
 			System.out.println(obj1 == obj4);
 */
		
		}
		
//		scope : prototype
		{
			
/*
 * 			Student bean id : s2
 * 			prototype scope provide whole new instance for every getBean
 */
			ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("studentConfig.xml");
			
			Student obj1 = container.getBean("s2" , Student.class);
			Student obj2 = container.getBean("s2" , Student.class);
			Student obj3 = container.getBean("s2" , Student.class);
			Student obj4 = container.getBean("s2" , Student.class);
			
			System.out.println(obj1 == obj2);
			System.out.println(obj1 == obj3);
			System.out.println(obj1 == obj4);
		}
		
	}
}
