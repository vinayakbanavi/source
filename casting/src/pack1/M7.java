package pack1;

public class M7 
{
	public static void main(String[] args) 
	{
		int i = 130;
		byte  b1 = (byte)i;
		
//		for value beyond its limit will switch to negetive values
//		byte range --> -128     0      127
//		so for after +127  i,e int +128 -->  byte -128
//		130 - 128 = 2    , in negative -128 + 2 = -126
		
		System.out.println(i);
		System.out.println(b1);
	}
}
