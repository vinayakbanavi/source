class H 
{
	int i;

	H(int i)
	{
		this.i = i;
	}

	public static void main(String[] args) 
	{
		H h1 = new H(36);
		System.out.println("main1 : " + h1.i); 
		H h2 = new H(147);
		System.out.println("main1 : " + h2.i); 
	}
}
