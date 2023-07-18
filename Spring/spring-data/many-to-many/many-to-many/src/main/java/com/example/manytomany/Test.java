/*
		
 		if class is Annotated with @Component
 		while starting the Application
 		
 		Framework will scan all the classes only in the base package for @Component
 		
		FrameWork will create Objects to Every Component class
		
		@AutoWired will wire the declared variable to this Created Object
*/

package com.example.manytomany;

import org.springframework.stereotype.Component;

@Component
public class Test 
{
	Test()
	{
		System.out.println("Object Created for Test" + this);
	}
}
