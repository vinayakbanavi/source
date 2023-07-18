package pack1;

public class M8
{
	public static void main(String[] args) 
	{
		int i = 35000;
		short s1 =(short) i;
		
//		-32768    0     +32767
//		s1 = -32768 + (35000 - 32768)
		System.out.println(i);
		System.out.println(s1);
	}
}
