//consider all the brackets .. (, [, {, <.
import java.util.Scanner;

class Q45
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the string to check paranthesis Balance : ");
		String s1 = scanner.nextLine();
		String s2 = "";
		boolean status = false;
		char ch;
		for (int i = 0; i < s1.length() ; i++)
		{
			ch = s1.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{' || ch == '<')
			{
				s2 += ch;
			}

			if (ch == ')' || ch == ']' || ch == '}' || ch == '>')
			{
				status = s2.length() == 0? false : compare(s2.charAt(s2.length() - 1), ch);

				if (status == true)
				{
					s2 = s2.substring(0, s2.length() -1);
				}

				else
				{
					break;
				}
			}
		}

		System.out.println((s2.length() == 0 && status) ? "--> is balanced" : "--> is not balanced");

	}

	public static boolean compare(char ch1 , char ch2)
	{
		return ((ch1 == '(' && ch2 == ')') || 
			    (ch1 == '[' && ch2 == ']') || 
			    (ch1 == '{' && ch2 == '}') || 
			    (ch1 == '<' && ch2 == '>'));
	}
}
