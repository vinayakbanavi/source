class H 
{
	int a;
	String b;

	H(int i , String s1)
	{
		a = i;
		b = s1;
	}

	public static void main(String[] args) 
	{
		H obj1 = new H(100, "abc");
		System.out.println(obj1.a + ", " + obj1.b);
		H obj2 = new H(542, "xyz");
		System.out.println(obj2.a + ", " + obj2.b);
	}
}

// through constructer we can initialize object members