class Z1 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
		for (; ; ) //
		{
             System.out.println("for loop : " + i);
			 i++;
		}
		System.out.println("main end" + i);
	}
}
// if there is no boolean condition it takes default as true and the control remains inside the for loop 
// error unreachable statement System.out.println("main end" + i);