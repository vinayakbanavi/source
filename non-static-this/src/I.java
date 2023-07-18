class I
{
	int i;
	static int j;

	void test(int i, int j)	
	{
		this.i = i;
		I.j = j;
	}

	public static void main(String[] args) 
	{
		I obj = new I();
		obj.test(15, 60);
		System.out.println("main1 : " + obj.i);
		System.out.println("main1 : " + I.j);
	}
}
