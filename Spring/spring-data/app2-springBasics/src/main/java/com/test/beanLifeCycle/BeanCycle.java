/*
 * Bean class : BeanCycle

   life cycle of a Spring bean : 
   IOC : instantiation --> initialization --> usable object
   
   After usage : 
   when the bean served its purpose, it will be removed from the container.
   some cleanup is necessary.
   
   init-method : setup the object
   destroy-method : to teardown the object
   
   there is also a feature of specifying 
   default-init-method
   default-destroy-method
   directly in the xml to manage all the beans 

To define setup and teardown for a bean, we simply declare the <bean> with initmethod and/or destroy-method parameters.
 */

package com.test.beanLifeCycle;

public class BeanCycle 
{
	
/*
 * 	init-method (initialization method)
 *  it will be called internally after the instantiation or bean is created in the container
 *  first method to execute after instantiation
 */
	
	public void init()
	{
		System.out.println("Bean members Initialization in process");
	}
	
	private String message;
	
	BeanCycle()
	{
		System.out.println("Bean object created");
	}
	
	public String getMessage() 
	{
		return message;
	}
	
	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	/*
	 * 	destroy-method
	 *  is called before the bean is removed from the Container
	 */
	public void destroy()
	{
		System.out.println("Bean is removed from the container");
	}
}
