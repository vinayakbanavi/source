class O 
{
	public static void main(String[] args) 
	{
		int i = 10;
		double d = 3.4;
		char c = 't';

		String s1 = Integer.toString(i);
		String s2 = Double.toString(d);
		String s3 = Character.toString(c);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1 + s2 + s3);
	}
}
