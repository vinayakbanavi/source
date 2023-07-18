class G
{
	public static void main(String[] args) 
	{
		int i = 20;
		System.out.println("main begin" + i);
		if (false)
		{
           System.out.println("if block");
		}

		else
		{    
			i = 10;
		    System.out.println("else block");
		    System.out.println("else block");
		    System.out.println("else block");
		    System.out.println("else block");
		    System.out.println("else block" + i);
		}
        System.out.println("main end" + i);
	}
}
