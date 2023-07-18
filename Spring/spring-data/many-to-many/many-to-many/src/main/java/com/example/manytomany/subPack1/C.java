package com.example.manytomany.subPack1;

import org.springframework.stereotype.Component;

//@Component can have identifier
@Component("cType")
public class C extends A
{
	
//	Override
	public String toString() 
	{
		return "I am from C";
	}
}
