package pack1;

class X
{
	
}

class Y extends X
{
	
}

class Z extends Y
{
	
}

class U
{
	Y test()
	{
		return null;
	}
}

class V extends U
{
	Z test()
	{
		return null;
	}
}

public class M10 
{
	public static void main(String[] args) 
	{
		System.out.println("Covariant return type");
	}
}

// if return type of a method is derived data type.
// overriding method should have same class as that of previous or subclass of the previous class.
// subclass comes under co-variant of superclass.
