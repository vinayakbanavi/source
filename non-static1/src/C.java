class C 
{
	C()
	{
		System.out.println("stmt1");
		System.out.println("stmt2");
		System.out.println("stmt3");
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("-------");
		C c2 = new C();
		System.out.println("-------");
		C c3 = new C();
		System.out.println("-------");
	}
}

//constructer can have any number of statemnt and any type of statement