class F 
{
	int i;
	int j;
	public static void main(String[] args) 
	{
		F obj = new F();
		System.out.println(obj.i + ", " + obj.j);
		obj.i = 100;
		obj.j = 6;
		System.out.println(obj.i + ", " + obj.j);
	}
}
