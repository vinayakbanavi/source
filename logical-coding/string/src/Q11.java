// Reading first 3 characters  and last 3 characters
//one from the first and one from the last, like wise 3 from the first and 3 from the last

class Q11
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefghij";
		           //0123456789
	  // s1.length() = 10

		System.out.println(s1);
		System.out.print(s1.charAt(0));
		System.out.print(s1.charAt(s1.length() - 1));
		System.out.print(s1.charAt(1));
		System.out.print(s1.charAt(s1.length() - 2));
		System.out.print(s1.charAt(2));
		System.out.print(s1.charAt(s1.length() - 3));
		
	}
}
