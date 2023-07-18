class Q 
{
	public static void main(String[] args) 
	{
		int i = 1;
		i = i++; // i++ --> 1++ --> 2 but the change takes place in the next usage,the change doesnt the current operataion
		System.out.println(i); 
	}
}
