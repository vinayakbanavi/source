package com.test.innerBeanDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInnerBean 
{
	public static void main(String[] args) 
	{
//		IOC Spring Containers 1. ApllicationCOntext 2. BeanFactory
		
//		using ApplicationContext Container
//		applying MetaData to the container
		
		ApplicationContext container = new ClassPathXmlApplicationContext("innerBean.xml");
		
		Computer obj = container.getBean("c1", Computer.class);
		obj.print();
	}
}
