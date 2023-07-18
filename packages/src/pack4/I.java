package pack4;

class  I extends G
{
	public static void main(String[] args) 
	{
		I obj = new I();
		System.out.println(obj.i);
		System.out.println(obj.j);
		obj.k = 12;
		System.out.println(obj.k);
	}
}
