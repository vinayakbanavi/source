class C 
{
	public static void main(String[] args) 
	{
		int i = 0,j;
		j = ++i  +  --i  + i  -  ++i  +  --i  + ++i - --i  + i - --i - i + ++i + ++i  + i  +  ++i ;
		//  1    +  0    + 0  -  1    +   0   + 1   -  0   + 0  - -1 - -1 + 0  + 1    + 1  +   2
		System.out.println(i); //2
		System.out.println(j); //7
	}
}
