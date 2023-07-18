class A1
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");

//		assert statement will not execute by default 
//      we must enable assertion explicitly through vm arguments
//		java -cp ../classes -ea A1

		assert false;
		System.out.println("main end");
	}
}
