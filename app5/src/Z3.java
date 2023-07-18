class Z3 
{
	public static void main(String[] args) 
	{
		boolean b1 = true, b2 = false;
		System.out.println(b1 || b2);  
		System.out.println(b1 && b2);  
		System.out.println(b1 || !b2);
		System.out.println(b1 && !b2); 
		System.out.println(!b1 || b2); 
		System.out.println(!b1 && b2); 
		System.out.println(!b1);       
		System.out.println(!b2);       
		System.out.println(b1);        
		System.out.println(b2);      
	}
}

/*
true
false
true
true
false
false
false
true
true
false
*/