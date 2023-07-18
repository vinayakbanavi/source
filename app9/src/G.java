class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		if (false)
		{
			System.out.println("if block");
		}
		else
		{
			if (false)
			{
				System.out.println("if2");
			}
			else
			{
				System.out.println("else 2");
			}
		}
		System.out.println("main end");
	}
}

//else body can have if else

/*
main begin
else2
main end

*/