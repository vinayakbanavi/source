class  A3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
	    int j = test1(i++)  +  i  +  test2(i++)  +  i    +  test1(++i)  +  i    +
			  //    1       +  2  +    3         +  3    +    4         +  4    +
			    test2(++i)  +  i  +  test1(i--)  +  i++  +  test2(--i)  +  i--  +
			//    6         +  5  +    5         +  4(5) +     5        +  4(3) +
			    i++   +  test2(i++)  +  i++  + test1(i++)  +  i++   + test2(--i)  +  i;
		  //    3(4)  +       5      +  5(6) +   6         +  7(8)  +    8        +  7
		System.out.println("main : " + i + ", " + j);
		System.out.println("main end");
	}
	static int test1(int i)
	{ 
		return i++;
	}
	static int test2(int i)
	{
		return ++i;
	}

}

/*
main begin
main : 7 , 87
main end 
*/       