class  A2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = 1;
	    int j = test(i++);
		System.out.println("main : " + i + ", " + j);
		System.out.println("main end");
	}
	static int test (int i)
	{
		System.out.println("test method : " + i);
		return i++;
	}

}
/*
main begin
test method 1
main : 2 , 1
main end
*/
