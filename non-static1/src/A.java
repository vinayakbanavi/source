class A 
{
	A()
	{
		System.out.println("from A()");                                
	}

	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println("--------------");
		A a2 = new A();
		System.out.println("--------------");
		A a3 = new A();
		System.out.println("--------------");
	}
}


/*
  CONSTRUCTOR :

	A()
	{
		System.out.println("from A()");                                
	}

	IT IS A NON STATIC DEFINITION BLOCK.
	IT SHOULD HAVE A SAME NAME AS CLASS.
	CONSTRUCTOR SHOULD NOT HAVE RETURN TYPE , IF YOU KEEP RETURN TYPE IT WILL BECOME METHOD.
	CONSTRUCTOR EXECUTES AUTOMATICALLY WHILE OBJECT IS CREATING.