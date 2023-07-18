//Nearest end to a particular character in a given String

class  Q27
{
	public static void main(String[] args) 
	{
		String s1 = "hello abc test";
		char c1 = 'a';
         
		/*
		int i = s1.indexOf('a');
		
		if ( i < s1.length()/2)
		System.out.println("nearer to left end");
		else
		System.out.println("nearer to left end");
		*/

		int leftend = s1.indexOf(c1);
		int rightend = s1.length()-1 - leftend;

		if ( leftend < rightend)
		System.out.println("nearer to left end");
		else
		System.out.println("nearer to left end");

	}
}
