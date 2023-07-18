class O 
{
	O(int i)
	{
		System.out.println("O(int)");
	}
	O()
	{
		System.out.println("O()");
	}
}

class P extends O
{
	P(int i)
	{
		System.out.println("P(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P p1 = new P(9);
		System.out.println("main end");
	}
}

/*
main begin
O()
P(int)
main end
*/