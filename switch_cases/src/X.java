class X 
{   
	enum En {C1, C2, C3, C4}
	public static void main(String[] args) 
	{
		System.out.println(En.C1);
		switch (En.C1)
		{
		case C1:
			System.out.println(" from case C1");
		    break;
		case C2:
			System.out.println(" from case C2");
		    break;
		case C3:
			System.out.println(" from case C3");
		    break;
		case C4:
			System.out.println(" from case C4");
		    break;
		
		}
		
	}
}
 