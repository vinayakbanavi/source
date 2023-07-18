class  I
{
	int a,b;
	public static void main(String[] args) 
	{
		I  obj1 = new I();
		System.out.println(obj1.a + ", " + obj1.b);
		I obj2 = obj1;
		System.out.println(obj1.a + ", " + obj1.b);
		System.out.println(obj2.a + ", " + obj2.b);
		obj1.a = 10;
		System.out.println(obj1.a + ", " + obj1.b);
		System.out.println(obj2.a + ", " + obj2.b);
		obj2.b = 20;
		System.out.println(obj1.a + ", " + obj1.b);
		System.out.println(obj2.a + ", " + obj2.b);
		
	}
}
