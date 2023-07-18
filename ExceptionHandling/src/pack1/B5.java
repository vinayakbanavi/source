class A
{
	static int i;
}

class B5 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(A.i);
/*
		Compile successfully
		generating two class files
			1. A.class
			2. B5.class

		After compilation remove the generated A.class in the classes folder for E

		now we will get Abnormality

		Exception in thread "main" java.lang.NoClassDefFoundError: E
        at F.main(F.java:10)
		
		Abnormality ClassNotFoundException
*/
		System.out.println("main end");
	}
}
