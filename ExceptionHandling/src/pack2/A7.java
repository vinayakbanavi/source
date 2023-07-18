class A7
{
	static Integer i;

	public static void main(String[] args) 
	{
//		UnChecked : NullPointerException
//      Compiler not taking care about syntax of unchecked 
		
		int sum = i + 5;
		System.out.println(sum);
	}
}
