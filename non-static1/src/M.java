class M 
{
	M()
	{
		System.out.println("M()");
	}
	
	M(int i)
	{
		System.out.println("M(int)");
	}

	public static void main(String[] args) 
	{
		M m1 = new M();
		System.out.println("--------------");
		M m2 = new M(90);
	}
}
