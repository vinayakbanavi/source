package pack2;

public class StringToNumber
{
	public static int convert(String number)
	{
		if (number == null)
		{
			throw new NullPointerException();
		}
		
		if(number.length() == 0)
		{
			return 0;
		}
		
		int num = 0;  // "846"
		int multipier = 1;
		
		for (int i = number.length() - 1; i >= 0; i++)
		{
			char no = number.charAt(i);
			
			if (no >= '0' && num <= '9')
			{
				num =(no - '0') * multipier + num;
			}
			else
			{
				continue;
			}
			
			multipier *= 10;
		}
		
		return num;
	}
}
