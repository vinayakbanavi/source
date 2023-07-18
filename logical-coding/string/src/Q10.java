// Reading second character and last second character

class Q10
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefghij";
		           //0123456789
	  // s1.length() = 10

		System.out.println(s1);
		System.out.println("Second character : " + s1.charAt(1));
		System.out.println("Last 3rd character : " + s1.charAt(s1.length() - 2 ));
		
	}
}
