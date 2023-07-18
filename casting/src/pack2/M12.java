package pack2;

public class M12 
{
	public static void main(String[] args) 
	{
		Object o1 = new C();
		System.out.println(o1 instanceof Object);
		System.out.println(o1 instanceof A);
		System.out.println(o1 instanceof B);
		System.out.println(o1 instanceof C);
	}
}
