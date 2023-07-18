class O 
{

	final int i;
	O()
	{
		i = 10;
	}

	O(String s1)
	{
		i = 300;
	}

	public static void main(String[] args) 
	{
		O o1 = new O();
		O o2 = new O("hello");

		System.out.println(o1.i + ", " + o2.i);

//     o1.i = 10;
//     o2.i = 100;
	}
}

// By default only one specifed constructor will execute for one object creation
// so assignment happens only once;
// compiles successfully

// non static global final variable constant for current object