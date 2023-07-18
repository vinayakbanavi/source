package com.example.manytomany.subPack1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @AutoWired will wire the reference to the Object of Primary Component class
@Primary
public class B extends A
{
	
//	Override
	public String toString()
	{
		return "I am from B";
	}
}
