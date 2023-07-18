class J 
{
	J()                                             // no argument costructor 
	{
		System.out.println("J()");
	}

	J(int i)                                        // constructor with argument
	{
		System.out.println("J(int)");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		J j1 = new J();                             // whichever constructer is specifying same will be executing
		System.out.println("-------------");
		J j2 = new J(10);
		System.out.println("main end");
	}
}

// J(int i) ==> Signature
// there should be change in the signature may or not be changes in the body when multiple constructor
// developing multiple constructor by choosing difference in the signature is called as constructor overloading