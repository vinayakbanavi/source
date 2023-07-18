class G
{
	public static void main(String[] args) 
	{
		System.out.println("main begin"); 
		int i = 0;
		if(true)
		{
            System.out.println("from if 1 :" + i); //0
			i++;
            System.out.println("from if 2 :" + i); //1
			i += 20;   // i = i + 20
            System.out.println("from if 3 :" +i);  //21 
			i -= 1;   // i = i - 1
            System.out.println("from if 4");       //20 
		}

        System.out.println("main end :" + i);      //20
	}
}
