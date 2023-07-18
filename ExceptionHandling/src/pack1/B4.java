class B4
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B3.test();
//		Abnormality NoSuchMethodError
//		this type of abnormality arises when something got removed from the class and not present in the comiled class

		System.out.println("main end");
	}
}

/*
	1. Compile the B3 with test() 
		Now generated class file having test method 

	2. Compile the B4 which is calling B3.test() 
		compiles and run successfully

	3. in some rare cases if B3 get modified and test() has been removed
		compiled B4 class not containing test()

	4. now if we run the previously compiled B4(i,e without compiling again)
		we will get 
		Exception in thread "main" java.lang.NoSuchMethodError: 'void B3.test()' at B4.main(B4.java:6)
*/
