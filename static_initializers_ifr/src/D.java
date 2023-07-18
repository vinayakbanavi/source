class D
{
	static
	{
		System.out.println("from sib begin");
		main(null);
		System.out.println("from sib end");
	}

	public static void main(String[] args) 
	{
		System.out.println("main");
	}
}
/*
from sib begin
main
from sib end
main

*/