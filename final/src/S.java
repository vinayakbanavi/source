class S 
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

// static memebr loading to the memory only one time so final static global attribute constant for entire execution.
// static and final cosidered as a perfect constant