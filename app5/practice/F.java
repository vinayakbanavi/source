class F 
{
	public static void main(String[] args) 
	{
		int  i = 5;
		int j = --i  +  --i  -  ++i  +  i++  +  i--    +  -i   -  --i  +  i++    +  --i   +  i  +  --i  -  ++i  +  --i  +  i;
		//      4    +   3   -  4    +   4   +  5(4)   -   4   -   3   +   3(4)  +  3     +  3  +  2    -   3   +   2    + 2 
		System.out.println(i++);// 2
		System.out.println(--j); // 16
	}
}
