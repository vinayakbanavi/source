class E
{
	public static void main(String[] args) 
	{
		System.out.println("main begin"); 
		if(true)
		{
			int i = 0;
            System.out.println("from if 1 :" + i);  // from if : 0
			i++;
            System.out.println("from if 2 :" + i);  // from if : 1
			i += 20;   // i = i + 20
            System.out.println("from if 3 :" +i);   // from if : 21
			i -= 1;   // i = i - 1
            System.out.println("from if 4");        // from if : 20
		}

        System.out.println("main end");
	}
}
