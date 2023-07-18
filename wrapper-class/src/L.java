class L 
{
	public static void main(String[] args) 
	{
		Boolean obj = Boolean.valueOf("abc");  // Here we dont get Exception
//      in case of boolean if it is other than true it will store as a false
		boolean b1 = obj.booleanValue();
		System.out.println(b1);
	}
}
