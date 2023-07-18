import java.util.Scanner;

class Q44a 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please provide a String to check balanced or not : ");
		String s1 = scanner.next();
		String s2 =" ";
		char ch,ch1;

		for (int i = 0; i < s1.length() ; i++ )
		{

			ch = s1.charAt(i);
			
			if (ch == '(' ||ch == ')' || ch == '[' || ch == ']' )
			{
				ch1 = s2.charAt(s2.length() - 1);
				if (ch1 == '(' && ch == ')' || ch1 == '[' && ch == ']')
				{
					s2 = s2.substring(0, s2.length() - 1);
				}
				else
				{
				s2 += ch;
				}
			}
			
		}

		if (s2.length() == 1)
		System.out.println(s1 + " --> is balanced");
		else
		System.out.println(s1 + " --> is not balanced");
	}
}
