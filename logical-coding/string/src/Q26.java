//lastIndexOf(String)

class Q26 
{
	public static void main(String[] args) 
	{
		String s1 = "abc abc abc";

		System.out.println(s1.lastIndexOf("abc"));
		System.out.println(s1.lastIndexOf("abc",7));
		System.out.println(s1.lastIndexOf("abc",3));
		System.out.println(s1.lastIndexOf("abc",2));
		System.out.println(s1.lastIndexOf("abc",1));
		System.out.println(s1.lastIndexOf("abc",0));// gives the starting point of a string serching
	}
}
