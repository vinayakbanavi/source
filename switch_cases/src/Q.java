class Q 
{
	enum Test{ABC, XYZ, CON, HELLO};
	public static void main(String[] args) 
	{
		System.out.println(Test.ABC.ordinal());
		System.out.println(Test.XYZ.ordinal());
		System.out.println(Test.CON.ordinal());
		System.out.println(Test.HELLO.ordinal());
	}
}
//ENUM IS ONLY FOR MAINTAINING MULTIPLE CONSTANTS