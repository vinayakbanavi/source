package com.test.beanLifeCycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBeanCycle 
{
	public static void main(String[] args) 
	{
//		IOC container : SpringApplicationContext
//		Applying MetaData to the container
		
		ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beanCycleMetaData.xml");
		
//		bean scope is default : singleton
//		getBean will return Bean object reference
		
		BeanCycle object = container.getBean("o1", BeanCycle.class);
		System.out.println(object.getMessage());
		
//		destroy method executes on shutDown
//		After complete usage of the object in the container
		
//		registerShutdownHook removes the object from the container 
//		while closing it calls destroy method internally
//		Executes After all the usage of the object
//		last statement of execution regardless of its placement in the flow
		container.registerShutdownHook();
		
		System.out.println(object.getMessage());
	}
}
