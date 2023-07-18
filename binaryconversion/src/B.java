class B
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.parseInt("1100100",2));
		System.out.println(Integer.parseInt("100101100",2));
		System.out.println(Integer.parseInt("11110",2));
		System.out.println(Integer.parseInt("101000",2));
		System.out.println(Integer.parseInt("1000110",2));
		System.out.println(Integer.parseInt("1001110",2));
		System.out.println(Integer.parseInt("1001110"));
	}
}

/*

1100100

0 -> 2^0 * 0 = 0
0 -> 2^1 * 0 = 0
1 -> 2^2 * 1 = 4
0 -> 2^3 * 0 = 0
0 -> 2^4 * 0 = 0
1 -> 2^5 * 1 = 32
1 -> 2^6 * 1 = 64
-------------------
               100

binary   ----> decimal         
1100100  ----> 100


11110  

0 * 2^0 = 0
1 * 2^1 = 2
1 * 2^2 = 4
1 * 2^3 = 8
1 * 2^4 = 16
---------------
          30

101000
*/