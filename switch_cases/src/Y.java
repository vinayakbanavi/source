class Y
{   
	enum En {C1, C2, C3, C4}
	public static void main(String[] args) 
	{
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
		case C5:
			System.out.println(" from case C4");
		    break;
		
		}
		
	}
}
// ERROR - AN ENUM SWITCH CASE LABEL MUST BE THE UNQUALIFIED NAME OF AN ENUMERATION CONSTANT