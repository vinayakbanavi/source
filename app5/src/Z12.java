class Z12 
{
	public static void main(String[] args) 
	{
        int i = 0;
		System.out.println((i++   == i++)  && (++i == i++)); 
	//	System.out.println( 0(1) == 1(2)) && doesn't execute RHS
    //                       false        if one operand is false in logic & RHS will not execute
		System.out.println(i);                           

		i = 0;
		System.out.println((i++ == i++) || (++i == i++)); 
		System.out.println(i);                           


		i = 0;
		System.out.println((++i == i++) && (i++ == i++));
		System.out.println(i);                          


	}
}

/*
false
2

true
4

false
4
*/