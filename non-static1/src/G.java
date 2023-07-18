class G 
{
	int i;
	int j;

	G(int p,int q)
	{
		i = p;
		j = q;
	}

	public static void main(String[] args) 
	{
		G g1 = new G(10,20);
		System.out.println(g1.i+ ", "+ g1.j);
		G g2 = new G(48,789);
		System.out.println(g2.i+ ", "+ g2.j);
	}
}
