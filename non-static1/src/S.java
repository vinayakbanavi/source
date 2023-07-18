class S
{
	S()
	{
		this(false);
		System.out.println("S()");
	}

	S(int i)
	{                                  
		System.out.println("S(int)");
	}

	S(boolean j)
	{                                  
		System.out.println("S(boolean)");
	}


	public static void main(String[] args) 
	{
		S s1 = new S();
		System.out.println("-----------");
		S s2 = new S(20);
		System.out.println("-----------");
	}
}