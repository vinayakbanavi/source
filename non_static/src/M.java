class M 
{
	int i;
	public static void main(String[] args) 
	{
		M m1 = new M();
		M m2 = new M();
		M m3 = new M();
		M m4 = new M();
		M m5 = new M();
		System.out.println(m1.i + ", " + m2.i + ", " + m3.i + ", " + m4.i + ", " + m5.i);
		m1.i = 1;
		m2.i = 10;
		m3.i = 340;
		m4.i = 30;
		m5.i = 36;
		System.out.println(m1.i + ", " + m2.i + ", " + m3.i + ", " + m4.i + ", " + m5.i);
	}
}
