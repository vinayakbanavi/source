  class Z
{
	static int i = test1();
	static int j = test2();

	public static int test1()
	{
		System.out.println("from test1 begin : " + i + ", " + j);
		i += 1;
		j += 2;
		main(null);       
		System.out.println("from test1 end : " + i + ", " + j);    
	//	System.exit(0);
		return i + j + 3;
	}
	public static int test2()
	{
		System.out.println("from test2 begin : " + i + ", " + j);
		i += 4; 
		j += 5; 
		main(null);       
		System.out.println("from test2 end : " + i + ", " + j);            
		return i + j + 6;
	}
	public static void main(String[] args) 
	{
		System.out.println("main : " + i + ", " + j);
		i += 7;
		j += 8;
	}
}


/*
from test1 begin : 0,0
main 1, 2
from test1 end : 8, 10
from test2 begin : 21,10
main : 25, 15
from test2 end : 32, 23
main : 32, 61

*/