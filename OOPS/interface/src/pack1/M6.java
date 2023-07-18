package pack1;

interface I
{
	//int a;
	public int b = 10;
	static int c = 15;
	final int  d = -74;
	public static final int    e = 1000;
	public final static String f = "abc";
	public final int g = 1000;
	final static String h = "xyz";
	
	// by default every attributes of interface will be 
	// public static final 
	
	// because of static we can use it with a class/interface name
	// because of final it must be initialized while declaring itself
}

public class M6
{
	public static void main(String[] args) 
	{
		System.out.println(I.b);
		System.out.println(I.c);
		System.out.println(I.d);
		System.out.println(I.e);
		System.out.println(I.f);
		System.out.println(I.g);
		System.out.println(I.h);
	}
}
