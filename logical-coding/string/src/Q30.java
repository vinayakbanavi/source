//substring()

class Q30 
{
	public static void main(String[] args) 
	{
		String s1 = "lara tech";

		int i = s1.indexOf(' ');

		String s2 = s1.substring(0, 0);
		String s3 = s1.substring(1, 1);
		String s4 = s1.substring(6, 6);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
	}
}
