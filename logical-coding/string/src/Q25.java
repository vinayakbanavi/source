//lastIndexOf(char)

class Q25 
{
	public static void main(String[] args) 
	{
		String s1 = "abc abc abc";

		System.out.println(s1.lastIndexOf('a',7));
		System.out.println(s1.lastIndexOf('b',7));
		System.out.println(s1.lastIndexOf('c',7));

		System.out.println(s1.lastIndexOf('a',3));
		System.out.println(s1.lastIndexOf('b',3));
		System.out.println(s1.lastIndexOf('c',3));
	}
}