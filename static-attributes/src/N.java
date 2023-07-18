class N
{
	static int a;
	public static void main(String[] args) 
	{
		System.out.println("main1 : " + a);
		int a = 9;                           
		System.out.println("main2 : " + N.a);  // specifically refering static attribute with class name ----> classname.varible 
		System.out.println("main2 : " + a);
	}
}
