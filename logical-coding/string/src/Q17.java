class Q17
{
	public static void main(String[] args) 
	{
		String s1 = "abc";
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('a', 0));
		System.out.println(s1.indexOf('a', 44));   // -1 no exception 
		System.out.println(s1.indexOf('a', 2));
		System.out.println(s1.indexOf('b', 1));
	}
}
