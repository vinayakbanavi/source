class G 
{
	int a;
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println(g1.a);
		g1.a = 10;
		System.out.println(g1.a);
		G g2 = g1;
		System.out.println(g1.a);
		System.out.println(g2.a);
		g1.a = 20;
		System.out.println(g1.a);
		System.out.println(g2.a);
		g2.a = 18;
		System.out.println(g1.a);
		System.out.println(g2.a);
	}
}
