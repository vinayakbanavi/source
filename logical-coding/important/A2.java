//String builder

class  A2
{
	public static void main(String[] args) 
	{
		String s1 = "Hello World!";

		/*  1.
			StringBuilder s2 = new StringBuilder(s1);
			s2.reverse();
			System.out.println(s2);
			output - !dlroW olleH
		*/
        
		/*	2.
			StringBuilder s2 = new StringBuilder();
			s2.append(s1);
			s2.reverse();
			output - !dlroW olleH
		*/
		
		/*	3.
			StringBuilder s2 = new StringBuilder(s1);
			s2.deleteCharAt(0);
			System.out.println(s2);
			ello World!
		*/

		/*	4.
			StringBuilder s2 = new StringBuilder(s1);
			s2.setCharAt(0, 'A');
			//s2.setCharAt(s1.indexOf('!'),' ');
			System.out.println(s2);
        */
	}
}
