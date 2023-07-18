package pack1;

import org.springframework.stereotype.Component;

@Component
public class Abc 
{
	Abc()
	{
		System.out.println("Object from Abc : " + this);
	}
}


/*
		@Component will be Scanned by the frameWork only from
		1. Base package
		2. SubPackage of Base
*/