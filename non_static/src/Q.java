class Q 
{
	int i;

    static void test(Q obj)
	{
		System.out.println("from test : " + obj.i);
		obj.i += 5; // obj.i = obj.i + 5
	}

	public static void main(String[] args) 
	{
		Q q1 = new Q();
		q1.i = 10;
		System.out.println("main 1 : " + q1.i);
		test(q1);
		System.out.println("main 2 : " + q1.i);
		q1.i += 20;
		test(q1);
		System.out.println("main 3 : " + q1.i);
	}
}

/*
main 1 : 10
from test : 10
main 2 : 15
from test : 35
main 3 : 40
*/