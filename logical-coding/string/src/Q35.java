//String to char array

class  Q35
{
	public static void main(String[] args) 
	{
		String s1 = "abc hello test 123";
		char[] c = s1.toCharArray();
        
		for (char i : c)
		{
		System.out.print(i + ", ");
		}
	}
}
