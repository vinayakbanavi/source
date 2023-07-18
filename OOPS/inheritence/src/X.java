//SIB not inheriting to sub class

class A
{
	static
	{
		System.out.println("A - SIB"); 
	}

}
class X extends A
{
	static
	{
		System.out.println("X - SIB"); 
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println("main end");
	}
}

//while loading X,first A loads to memory since A is parent class to X
//without super class,sub class cannot be survived.