class A2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

//		assert statement will not execute by default 
//      we must enable assertion explicitly through vm arguments
//		java -cp ../classes -ea A1


//		if assert is true : condition is passed
		assert true;
		System.out.println("main end");
	}
}
