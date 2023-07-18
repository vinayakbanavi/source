class P 
{
	public static void main(String[] args) 
	{
		int i =1; 
		i = i--; // increament will takes place in the next usage, i is reinitialized with 1 only
		System.out.println(i);
	}
}

/*
1
*/