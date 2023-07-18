class F
{
	public static void main(String[] args) 
	{
		System.out.println("main begin"); 
		if(true)
		{
			int i = 0;
            System.out.println("from if 1 :" + i);
			i++;
            System.out.println("from if 2 :" + i); 
			i += 20;   // i = i + 20
            System.out.println("from if 3 :" +i);   
			i -= 1;   // i = i - 1
            System.out.println("from if 4");        
		}

        System.out.println("main end :" + i); // ERROR - CANNONT FIND SYMBOL i
	}
}
