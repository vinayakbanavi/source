interface A
{
	int i;
// by default public static final
// no SIB are allowed in the interface
// so we must assign the variable at the place of declaration
}

class T 
{
	final static int i;

	static
	{
		i = 10;
	}

	public static void main(String[] args) 
	{
		System.out.println("Done");
	}
}
