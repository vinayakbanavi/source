class G 
{
	int i;
	void test(int i)
	{
		this.i = i;
	}

	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("main1 : " + g1.i);
		g1.test(90);
		System.out.println("main2 : " + g1.i);
		g1.test(130);
		System.out.println("main3 : " + g1.i);
	}
}
