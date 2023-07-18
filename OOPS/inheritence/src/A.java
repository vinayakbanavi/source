class A           //superclass
{
	int i;
}

class B extends A //subclass
{
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		b1.i = 90;
		b1.j = 178;
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}

// every member of superclass inheriting to subclass is called inheritence
// All the attributes and methods inheriting to subclass
// Constructor, IIB, SIB not inheriting