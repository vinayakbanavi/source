class E 
{
	public static void main(String[] args) 
	{
		final int[] nums = new int[4];

//	We cant assign new Array even though with same size for the final variable
		nums = new int[4];
		System.out.println("done");
	}
}
