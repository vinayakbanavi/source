class B2
{
	public static void main(String[] args) 
	{
		System.out.println(B1.field);
	}
}

/*
	1. Compile the B1 with field 
		Now generated class file having field 

	2. Compile the B2 which is calling B1.field 
		compiles and run successfully

	3. in some rare cases if B1 get modified and field has been removed
		compiled B1 class not containing field

	4. now if we run the previously compiled B2(i,e without compiling again)
		we will get 
		Exception in thread "main" java.lang.NoSuchFieldError: field at B2.main(B2.java:5)
*/