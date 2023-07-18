class Q16
{
	public static void main(String[] args) 
	{
		String s1 = "abc abc abc";
		           //012345678910
		System.out.println(s1.indexOf('a'));
		System.out.println(s1.indexOf('b'));
		System.out.println(s1.indexOf('c'));
		System.out.println(s1.indexOf('a', 3));
		System.out.println(s1.indexOf('b', 3));
		System.out.println(s1.indexOf('c', 3));
		System.out.println(s1.indexOf('a', 7));
		System.out.println(s1.indexOf('b', 7));
		System.out.println(s1.indexOf('c', 7));
	}
}
