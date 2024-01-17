class H
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

		if(false)                                 	// opening brace and cosing brace are not required if one statement is there
			if(true)                          	// if only one statement in if no block is required
	    			System.out.println("if2");  	// if statement and immediate next statement of if will act as single statement
       
		System.out.println("main end");
	}
}
