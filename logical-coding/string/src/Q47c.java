// find out first repeated char
import java.util.Scanner;
class Q47c
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter a line of chars");
		String s1 = sc.nextLine();
		char c1='\u0000';
		boolean repeated = false, nonrepeated = false;
		for(int i = 0; i < s1.length();i++)
		{
			repeated = false;
			c1 = s1.charAt(i);
			for(int j = 0; j < s1.length(); j++)
			{
				if(i != j && c1 == s1.charAt(j))
				{
					repeated = true;
					break ;
				}
			}
			if(!repeated)
			{
				nonrepeated = true;
				break;
			}
		}
		System.out.println(nonrepeated ? "first non repeated:" + c1 : " no non repeated chars in" + s1);
	}
}