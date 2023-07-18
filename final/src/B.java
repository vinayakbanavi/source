class B 
{
	public static void main(String[] args) 
	{
		final int i = 10;
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);


		i = 25;
	}
}
// final variable can not be modified but we can use it any number of times
// Attempting to modify will give a compilation error