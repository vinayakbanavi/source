//Reading the character from a string in the out of bounds

class Q6
{
	public static void main(String[] args) 
	{
		String s1 = "hello abc";
		           //012345678
		char c1 = s1.charAt(9);
		System.out.println(s1);
		System.out.println(c1);
	}
}
