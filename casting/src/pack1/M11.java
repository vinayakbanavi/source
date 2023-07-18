package pack1;

public class M11 
{
	public static void main(String[] args) 
	{
		int i = 130;
		short s1 =(short) (byte) i;
		System.out.println(i);
		System.out.println(s1);
	}
}
// multiple conversion --> not recommended