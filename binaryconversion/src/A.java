class A 
{
	public static void main(String[] args) 
	{
		int i = 100;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(Integer.toBinaryString(150));
		System.out.println(Integer.toBinaryString(200));
		System.out.println(Integer.toBinaryString(18));
		System.out.println(Integer.toBinaryString(2)); 
		System.out.println(Integer.toBinaryString(2 )); 
	}
}
/*
300/2 = 150 + r0
150/2 = 75  + r0
75/2  = 37  + r1
37/2  = 18  + r1
18/2  = 9   + r0
9/2   = 4   + r1
4/2   = 2   + r0
2/2   = 1   + r0
1/2   = 0   + r1

decimal ----> binary
300     ----> 100101100

*/