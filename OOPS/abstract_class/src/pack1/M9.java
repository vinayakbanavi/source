package pack1;

abstract class M
{
	M()
	{
		System.out.println("M()");
	}
}

class N extends M
{
	N()
	{
		System.out.println("N()");
	}
}
public class M9 
{
	public static void main(String[] args) 
	{
		N n1 = new N();
	}
}
