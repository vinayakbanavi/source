class P
{
	int i;

	static void test (P p1)       
	{
		System.out.println("test : " + p1.i);
		p1.i = 10;
	}

	public static void main(String[] args) 
	{
		P ref = new P();
		ref.i = 5;
		System.out.println("main 1 : " + ref.i);
		test(ref);
		System.out.println("main 2 : " + ref.i);
	}
}

/*
if a method is static we can supply reference of an Object through arguments
in instance method no need to supply ref as already using one nonstatic member inside other non static member

object references can be from different methods

two references to the same object ref from main method and p1 from the test method

main1 : 5
test : 5
main 2 : 10
*/